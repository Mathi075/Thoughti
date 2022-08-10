package com.mathi.orders.jpa.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
@Entity
@Table(name="ORDERS")
@Getter
@Setter
public class Orders implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;
	private Date orderDate;
	private String orderStatus;
	@OneToMany(mappedBy="order")
	private List<Item> items;
	@Override
	public int hashCode() {
		return Objects.hash(orderId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Orders other = (Orders) obj;
		return Objects.equals(orderId, other.orderId);
	}
	
	

}
