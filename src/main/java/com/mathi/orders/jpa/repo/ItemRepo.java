package com.mathi.orders.jpa.repo;

import org.springframework.data.repository.CrudRepository;

import com.mathi.orders.jpa.entity.Item;

public interface ItemRepo extends CrudRepository<Item, Integer> {

}
