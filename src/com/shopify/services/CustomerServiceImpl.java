package com.shopify.services;

import static com.shopify.services.Validation.*;

import java.util.ArrayList;
import java.util.List;

import com.shopify.core.Customer;
import com.shopify.exceptions.BaseException;
import com.shopify.exceptions.DuplicateResourceException;

public class CustomerServiceImpl implements CustomerService {

	private List<Customer> customers;

	public CustomerServiceImpl() {
		this.customers = new ArrayList<>();
	}

	@Override
	public String registerCustomer(String name, String email, String password)
			throws DuplicateResourceException, BaseException {
		boolean isExist = emailExist(email, customers);
		if (isExist)
			throw new DuplicateResourceException("Email is already present please login");

//		check the email is exist

//		if all pass then add customer to list
		customers.add(new Customer(name, email, password));

		return "user registered successfully";
	}

	@Override
	public String loginCustomer(String email, String password) throws BaseException {

		boolean isExist = emailExist(email, customers);
		if (!isExist)
			throw new BaseException("Account doesn't exist");

		/*
		 * then find the user then check for password in list we first need the index of
		 * customer where its present then we can get referece of user then we can use
		 * that to check the user passowrd matches or not
		 */
		int index = customers.indexOf(new Customer(email));
//		then get the complete user

		Customer cst = customers.get(index);
		if (!cst.getPassword().equals(password)) {
			throw new BaseException("Invalid Credentials");
		}

//		then now this line execute when upper all things are working fine

		System.out.println(cst);
		return "userLoginSuccessfull";
	}

	@Override
	public void displayAllCustomer() {

		for (Customer cust : customers) {
			System.out.println(cust);
		}

	}

}
