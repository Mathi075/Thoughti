package com.mathi.orders;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import com.mathi.orders.jpa.entity.Orders;
import com.mathi.orders.service.OrderService;

@SpringBootTest
public class OrderServiceTest {
	@Autowired
	private OrderService orderService;
	@Test
	public void testSave() {
		Orders order=new Orders();
		order.setOrderDate(new Date());
		order.setOrderStatus("Created");
		Assert.notNull(orderService.saveOrder(order));
	}	
	@Test
	public void getOrder() {
		Assert.notNull(orderService.getOrder(1));
	}	
	@Test
	public void getAllOrders() {
		Assert.notNull(orderService.getAllOrder());
		
	}


}
