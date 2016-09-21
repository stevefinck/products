package com.stevefinck.retail.product;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.stevefinck.retail.product.name.ProductNameService;
import com.stevefinck.retail.product.price.ProductPrice;
import com.stevefinck.retail.product.price.ProductPriceService;

@RestController
public class ProductService {

	@Inject
	private ProductNameService nameService;
	
	@Inject
	private ProductPriceService priceService;
		 
	@RequestMapping(value = "/products/{productId}", method = RequestMethod.GET)
	public @ResponseBody Product getProduct(@PathVariable("productId") Long productId) {
		ProductPrice price = priceService.getPrice(productId);
		String name = nameService.getProductName(productId);
		Product product = new Product(productId, name, price);
		
		return product;
	}
}
