package com.stevefinck.retail.product.name;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProductNameService {
	
	public String getProductName(Long productId) {
		// use RestClient
		// add call to api.target.com
		// add some caching
		// deal with product name service being down (caching as one option)
		return "The Big Lebowski";
	}
	
	public String getQuote() {
		RestTemplate restTemplate = new RestTemplate();
	    Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
	    return quote.getValue().getQuote();
	}
}
