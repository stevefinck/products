package com.stevefinck.retail.product.price;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

@Service
public class ProductPriceService {
	
	@Inject 
	private ProductPriceRepository repository;
	
	public ProductPrice getPrice(Long productId) {
		return repository.findOne(productId);
	}
	
	public List<ProductPrice> findAll() {
		// TODO add paging for performance and scalability
		return repository.findAll();
	}
}
