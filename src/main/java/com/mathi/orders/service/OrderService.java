package com.mathi.orders.service;

import com.mathi.orders.jpa.entity.Orders;

public interface OrderService {
	public Orders saveOrder(Orders order);
	public Orders getOrder(Integer order_id);
	public Iterable<Orders> getAllOrder();

}
