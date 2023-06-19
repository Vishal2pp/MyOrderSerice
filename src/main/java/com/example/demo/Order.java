package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Order {
	public Order(int orderId, String orderName, double price) {
		super();
		this.orderId = orderId;
		this.orderName = orderName;
		this.price = price;
	}

	public Order() {
		super();
	}

	private int orderId;
	private String orderName;
	private double price;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderName=" + orderName + ", price=" + price + "]";
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
