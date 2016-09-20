package com.stevefinck.retail.product.price;

import java.util.Random;

import org.springframework.data.annotation.Id;

public class ProductPrice {
	
	@Id
	public Long id;
	public Long productId;	
	public Float price;
	public String currency;
	
	public ProductPrice() {
	}
	
	public ProductPrice(Long id, Long productId, Float price, String currency) {
		this.id = id;
		this.productId = productId;
		this.price = price;
		this.currency = currency;
	}
	public ProductPrice(Long productId, Float price, String currency) {
		this.id = (new Random()).nextLong();
		this.productId = productId;
		this.price = price;
		this.currency = currency;
	}
	public ProductPrice(String currency) {
		this.id = (new Random()).nextLong();
		this.productId = 0l;
		this.price = 0f;
		this.currency = currency;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
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
