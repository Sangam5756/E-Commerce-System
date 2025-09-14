package com.shopify.services;

import com.shopify.exceptions.BaseException;
import com.shopify.exceptions.DuplicateResourceException;

public interface CustomerService {

//	registercustomer logc

	public String registerCustomer(String name, String email, String password)
			throws DuplicateResourceException, BaseException;

	public String loginCustomer(String email, String password) throws BaseException;

	public void displayAllCustomer();
}
