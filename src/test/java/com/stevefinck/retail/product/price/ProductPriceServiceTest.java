package com.stevefinck.retail.product.price;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ProductPriceServiceTest {

	private Long PRODUCT_ID_1 = 1l;
	
	@InjectMocks
	private ProductPriceService service;
	
	@Mock
	private ProductPriceRepository repository;
	
	@Test
	public void getProductPrice() {
		Mockito.when(repository.findOne(PRODUCT_ID_1)).thenReturn(new ProductPrice(PRODUCT_ID_1, 19.99f, "USD"));
		
		ProductPrice productPrice = service.getPrice(PRODUCT_ID_1);
		
		Assert.assertNotNull("Result shouldn't be null", productPrice);
		Assert.assertEquals("USD", productPrice.getCurrency());
		Assert.assertEquals(PRODUCT_ID_1, productPrice.getProductId());
		Assert.assertEquals(19.99, productPrice.getPrice(), 0.1);
	}	
}
