package com.stevefinck.retail.product.name;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestTemplate;

@RestController
public class ProductNameService {
	
	private static final String RANDOM_QUOTE_URL = "http://gturnquist-quoters.cfapps.io/api/random";
	private static final String TARGET_API_URL = "https://api.target.com/products/v3/13860428?fields=descriptions&id_type=TCIN&key=43cJWpLjH8Z8oR18KdrZDBKAgLLQKJjz";
		
	public String getProductName(Long productId) {
		// add call to api.target.com
		// add some caching
		// deal with product name service being down (caching as one option)
		return getRandomQuote();
	}
	
	@RequestMapping(value = "/products/quote", method = RequestMethod.GET)
	public String getRandomQuote() {
		RestTemplate restTemplate = new RestTemplate();
		try {
			Quote quote = restTemplate.getForObject(RANDOM_QUOTE_URL, Quote.class);
			return quote.getValue().getQuote();
		} catch(ResourceAccessException re) {
			return "Product Name Not Found";
		}
	}
}
