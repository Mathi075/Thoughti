package com.mathi.orders.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mathi.orders.jpa.entity.Orders;
import com.mathi.orders.jpa.repo.OrderRepo;
@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	private OrderRepo orderRepo;
	
	@Override
	public Orders saveOrder(Orders order) {
		
		return orderRepo.save(order);
		
	}

	@Override
	public Orders getOrder(Integer order_id) {
		Optional<Orders> ord;
		ord= orderRepo.findById(order_id);
		if(ord.isPresent())
		{
			return ord.get();
		}
		else {
			return null;
		}
	}

	@Override
	public Iterable<Orders> getAllOrder() {
		return orderRepo.findAll();
	}

}
