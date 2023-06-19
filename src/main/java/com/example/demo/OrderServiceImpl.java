package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService{

	private List<Order> orders = Arrays.asList(new Order(1,"Mobile", 23000),
			new Order(2,"Bag", 5000),
			new Order(3,"Purse", 2000));
	@Override
	public List<Order> getAllOrders() {
		return orders;
	}

	@Override
	public Order getOrderById(int id) {
		return orders.stream().filter(s -> s.getOrderId() == id).findAny().orElse(null);
	}

}
