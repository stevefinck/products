package com.stevefinck.retail.product;

import org.springframework.data.annotation.Id;

import com.stevefinck.retail.product.price.ProductPrice;

public class Product {

	@Id
	public Long id;
	public String name;
	public ProductPrice price;
	
	public Product() {
	}
	public Product(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	public Product(Long id, String name, ProductPrice productPrice) {
		this.id = id;
		this.name = name;
		this.price = productPrice;
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
