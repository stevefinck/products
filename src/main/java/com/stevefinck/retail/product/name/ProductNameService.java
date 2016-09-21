package com.stevefinck.retail.product.name;

import org.springframework.stereotype.Service;

@Service
// @Component?
public class ProductNameService {
	public String getProductName(Long productId) {
		// use RestClient
		// add call to api.target.com
		// add some caching
		return "The Big Lebowski";
	}
}
