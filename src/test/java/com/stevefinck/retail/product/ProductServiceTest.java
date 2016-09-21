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

	private static final long PRODUCT_ID_1 = 1l;

	@InjectMocks
	ProductService service;
	
	@Mock
	ProductNameService nameService;
	
	@Mock
	ProductPriceService priceService;
	
	@Test
	public void testGetProduct() {
		Mockito.when(nameService.getProductName(PRODUCT_ID_1)).thenReturn("Real1");
		Mockito.when(priceService.getPrice(PRODUCT_ID_1)).thenReturn(new ProductPrice(-1l, 19.99f, "USD"));
				
		Product product = service.getProduct(PRODUCT_ID_1);
		
		Assert.assertEquals("Real1", product.getName());
		Assert.assertEquals(19.99d, product.price.getPrice(), 0.1);
	}
}
