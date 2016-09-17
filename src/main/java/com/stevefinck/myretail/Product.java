package com.stevefinck.myretail;

public class Product {

	public Long id;
	public String name;
	public ProductPrice price;
	
	public Product(String name) {
		this.name = name;
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
	
}
