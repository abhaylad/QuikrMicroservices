package org.quikr.productPage.repository;

import org.quikr.productPage.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, Long> {
	
	

}
