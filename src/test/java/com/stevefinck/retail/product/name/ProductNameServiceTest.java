package com.stevefinck.retail.product.name;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ProductNameServiceTest {

	@InjectMocks
	private ProductNameService service;
	
	@Test
	public void getDefaultProductName() {
		Assert.assertNotNull("Expected non-null response", service.getProductName(1l));
	}
}
