package com.stevefinck.retail.product.price;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductPriceRepository extends MongoRepository<ProductPrice, Long> {

}
