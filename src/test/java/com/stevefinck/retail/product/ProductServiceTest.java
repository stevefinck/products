package com.stevefinck.retail.product;

import java.util.List;

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
	public void testListProducts() {
		Mockito.when(nameService.getProductName(-1l)).thenReturn("Real1");
		Mockito.when(nameService.getProductName(-2l)).thenReturn("Real2");
		Mockito.when(priceService.getPrice(-1l)).thenReturn(new ProductPrice(-1l, 19.99f, "USD"));
		Mockito.when(priceService.getPrice(-2l)).thenReturn(new ProductPrice(-2l, 18.99f, "EUR"));
				
		List<Product> products = service.listProducts();
		
		Assert.assertEquals(2, products.size());
		Assert.assertEquals("Real1", products.get(0).getName());
		Assert.assertEquals("Real2", products.get(1).getName());
		
		Assert.assertEquals(19.99d, products.get(0).price.getPrice(), 0.1);
		Assert.assertEquals(18.99d, products.get(1).price.getPrice(), 0.1);
	}
}
