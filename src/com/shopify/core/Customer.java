package com.shopify.core;

import java.util.ArrayList;
import java.util.List;

public class Customer {
//		id, name, email, password, list of orders.
	private int id;
	private String name, email, password;
	private List<Order> order;
	public static int incrementId;

	static {
		incrementId = 0;
	}

	public Customer(String name, String email, String password) {
		this.id = ++incrementId;
		this.name = name;
		this.email = email;
		this.password = password;
//		as customer is new so initialize empty list
		this.order = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Order> getOrder() {
		return order;
	}

	public void setOrder(List<Order> order) {
		this.order = order;
	}

	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ",order="
				+ order + "]";
	}

}
