package com.mathi.orders.jpa.repo;

import org.springframework.data.repository.CrudRepository;

import com.mathi.orders.jpa.entity.Orders;

public interface OrderRepo extends CrudRepository<Orders, Integer> {

}
