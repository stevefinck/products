package com.stevefinck.myretail;

import java.io.Serializable;

import org.springframework.data.annotation.Id;

public class Product implements Serializable {

	@Id
	public String id;
	public String name;
//	public ProductPrice price;
	
	public Product(String id, String name) {
		this.id = id;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
