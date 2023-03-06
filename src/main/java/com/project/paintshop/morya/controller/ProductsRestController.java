package com.project.paintshop.morya.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.paintshop.morya.model.Products;
import com.project.paintshop.morya.service.ProductsService;

@RestController
@RequestMapping("/products")
@CrossOrigin
public class ProductsRestController {

	@Autowired
	ProductsService productsService;
	
	@GetMapping(value = "/allProd", produces = MediaType.APPLICATION_JSON_VALUE)
	public Collection<Products> getAllProducts() {
		
		return productsService.getAllProducts();
	}
	
	@PostMapping(value = "/addProd", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void AddProducts(@RequestBody Products products) {
		
		productsService.addProducts(products);
	}
}
