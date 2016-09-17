package com.stevefinck.myretail;

import org.springframework.data.annotation.Id;

public class Product {
	@Id
	public Long id;
	public String name;
	public Float price;
	public String currency;
	
	public Product() {
	}
	
	public Product(String name, String currency) {
		this.name = name;
		this.price = 0f;
		this.currency = currency;
	}
	public Product(String name, Float price, String currency) {
		this.name = name;
		this.price = price;
		this.currency = currency;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
}
