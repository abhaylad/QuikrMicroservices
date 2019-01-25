package org.quikr.productPage.controller;


import java.util.List;
import java.util.Optional;

import org.quikr.productPage.model.Product;
import org.quikr.productPage.service.Productservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/homepage")
public class ProductController {
	
@Autowired
	private Productservice ps;
	
	@GetMapping("/products")
	public List<Product> getproducts() {
		
		System.out.println(ps.getproducts());
		return ps.getproducts();
	}
	
	
	@GetMapping("/product/{id}")
	public Optional<Product> getproduct(@PathVariable Long id) {
		return ps.getproduct(id);
	}
	
	
}
