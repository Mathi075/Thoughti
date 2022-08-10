package com.mathi.orders.jpa.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "ITEM")
@Getter
@Setter
public class Item implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer itemId;
	private String itemName;
	private Double unitPrice;
	private Integer itemQuantity;
	
	@ManyToOne
	@JoinColumn(name="order_Id")
	private Orders order;
	@Override
	public int hashCode() {
		return Objects.hash(itemId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		return Objects.equals(itemId, other.itemId);
	}

}
