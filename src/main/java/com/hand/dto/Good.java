package com.hand.dto;

import org.springframework.stereotype.Repository;

@Repository
public class Good {
	private long id;
	private String name;
	private float price;
	private int quantity;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Good [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}

}
