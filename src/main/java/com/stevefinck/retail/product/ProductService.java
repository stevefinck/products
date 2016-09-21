package com.stevefinck.retail.product;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stevefinck.retail.product.name.ProductNameService;
import com.stevefinck.retail.product.price.ProductPriceService;

@RestController
public class ProductService {

	@Inject
	private ProductNameService nameService;
	
	@Inject
	private ProductPriceService priceService;
	
	@RequestMapping("/hello")
	public String hello() {
		return "hello Steve";
	}
	
	@RequestMapping("/products") 
	public List<Product> listProducts() {
		// TODO add paging
		List<Product> products = new ArrayList<Product>();
		
		Long product1Id = -1l;
		Product product1 = new Product(product1Id, nameService.getProductName(product1Id));
		product1.price = priceService.getPrice(product1Id);
		products.add(product1);
		
		Long product2Id = -2l;
		Product product2 = new Product(product2Id, nameService.getProductName(product2Id));
		product2.price = priceService.getPrice(product2Id);
		products.add(product2);
		
		return products;
	}
}
