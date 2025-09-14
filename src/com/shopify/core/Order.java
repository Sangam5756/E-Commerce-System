package com.shopify.core;

import java.util.ArrayList;
import java.util.List;

public class Order {

//	 orderId, customer, list of ordered items.
	private int orderId;
	private Customer customer;
	private List<OrderItem> orderItems;
	public static int IncrementOrderId = 111;

	public Order(Customer customer, List<OrderItem> orderItems) {
		this.orderId = ++IncrementOrderId;
		this.customer = customer;
		this.orderItems = new ArrayList<>();
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<OrderItem> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", customer=" + customer + ", orderItems=" + orderItems + "]";
	}

}
