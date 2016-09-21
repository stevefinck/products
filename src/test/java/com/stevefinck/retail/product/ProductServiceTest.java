package com.stevefinck.retail.product;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.stevefinck.retail.product.name.ProductNameService;
import com.stevefinck.retail.product.price.ProductPrice;
import com.stevefinck.retail.product.price.ProductPriceService;

@RunWith(MockitoJUnitRunner.class)
public class ProductServiceTest {

	@InjectMocks
	ProductService service;
	
	@Mock
	ProductNameService nameService;
	
	@Mock
	ProductPriceService priceService;
	
	@Test
	public void testGetProduct() {
		Mockito.when(nameService.getProductName(-1l)).thenReturn("Real1");
		Mockito.when(priceService.getPrice(-1l)).thenReturn(new ProductPrice(-1l, 19.99f, "USD"));
				
		Product product = service.getProduct(-1l);
		
		Assert.assertEquals("Real1", product.getName());
		
		Assert.assertEquals(19.99d, product.price.getPrice(), 0.1);
	}
}
