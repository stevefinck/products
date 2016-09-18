package com.stevefinck.myretail;

import java.io.Serializable;

import org.springframework.data.annotation.Id;

public class Product implements Serializable {

	@Id
	public Long id;
	public String name;
//	public ProductPrice price;
	
	public Product() {
	}
	public Product(Long id, String name) {
		this.id = id;
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
