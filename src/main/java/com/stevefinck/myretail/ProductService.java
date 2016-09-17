package com.stevefinck.myretail;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductService {

	@RequestMapping("hello")
	public String hello() {
		return "hello Steve";
	}
}
