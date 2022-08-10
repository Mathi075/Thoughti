package com.mathi.orders;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.util.Assert;

import com.mathi.orders.jpa.entity.Orders;


@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)

public class OrdersControllerTest {
	
	@Autowired
	private TestRestTemplate restTemplate;
	@LocalServerPort
    int randomServerPort;

	@Test
	public void testSave() {
		Orders order=new Orders();
		order.setOrderDate(new Date());
		order.setOrderStatus("Created");
		HttpEntity<Orders> request = new HttpEntity<>(order, new HttpHeaders());

		Assert.notNull( restTemplate.postForEntity("http://localhost:"+randomServerPort+"/order/create", request,String.class));	
	}
	@Test
	public void getOrder() {
		
		Assert.notNull( restTemplate.getForObject("http://localhost:"+randomServerPort+"/order/1", String.class));	
	}
	@Test
	public void getAllOrders() {
		
		Assert.notNull( restTemplate.getForObject("http://localhost:"+randomServerPort+"/orders", String.class));	
	}

}
