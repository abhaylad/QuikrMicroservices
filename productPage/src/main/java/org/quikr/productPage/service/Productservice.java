package org.quikr.productPage.service;

import java.util.List;
import java.util.Optional;

import org.quikr.productPage.model.Product;
import org.quikr.productPage.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Productservice {
	@Autowired
	private ProductRepository pr;

	public List<Product> getproducts() {
		
		return pr.findAll();
	}

	public Optional<Product> getproduct(Long id) {
		return pr.findById(id);
	}

}
