package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@GetMapping("/")
	public String welcome(){
		return "Welcome to Order Service";
	}
	@GetMapping("/getAllOrders")
	public List<Order> getAllOrders(){
		return orderService.getAllOrders();
	}
	
	@GetMapping("/getOrder")
	@ResponseBody
	public Order getOrder(@RequestParam(name="id") int id) {
		System.out.println("Getting order with Id="+id);
		return orderService.getOrderById(id);
	}
}
