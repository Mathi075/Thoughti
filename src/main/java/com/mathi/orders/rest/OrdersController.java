package com.mathi.orders.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mathi.orders.jpa.entity.Orders;
import com.mathi.orders.service.OrderService;

@RestController
public class OrdersController {
	@Autowired
	private OrderService orderService;
	
	@PostMapping("/order/create")
	@ResponseBody
	public Orders saveOrder(@RequestBody Orders order) {
		
		return orderService.saveOrder(order);	
	}
	@GetMapping("/order/{order_id}")
	@ResponseBody
	public Orders getOrder(@PathVariable Integer order_id) {
		return orderService.getOrder(order_id);
		
	}
	@GetMapping("/orders")
	@ResponseBody
	public Iterable<Orders> getAllOrder() {
		return orderService.getAllOrder();
		
	}
}
