package com.stevefinck.retail.product.name;

import org.junit.Assert;
import org.junit.Test;

public class ProductNameServiceTest {

	@Test
	public void getDefaultProductName() {
		ProductNameService service = new ProductNameService();
		Assert.assertEquals("Wrong answer", "The Big Lebowski", service.getProductName(1l));
	}
}
