package com.stevefinck.retail.product;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stevefinck.retail.product.price.ProductPrice;

@RestController
public class ProductService {

	@RequestMapping("/hello")
	public String hello() {
		return "hello Steve";
	}
	
	@RequestMapping("/products") 
	public List<Product> listProducts() {
		List<Product> products = new ArrayList<Product>();
		
		Product product1 = new Product(-1l, "Test");
		product1.price = new ProductPrice(-101l, -1l, 100.99f, "USD");
		products.add(product1);
		
		Product product2 = new Product(-2l, "Test2");
		product2.price = new ProductPrice(-102l, -2l, 99.99f, "USD");
		products.add(product2);
		
		return products;
	}
}
