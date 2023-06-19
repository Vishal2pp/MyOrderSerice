package com.example.demo;

import java.util.List;

public interface OrderService {
	public List<Order> getAllOrders();

	public Order getOrderById(int id);
}
