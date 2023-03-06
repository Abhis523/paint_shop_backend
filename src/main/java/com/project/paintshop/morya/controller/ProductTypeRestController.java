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

import com.project.paintshop.morya.model.ProductType;
import com.project.paintshop.morya.service.ProductTypeService;

@RestController
@CrossOrigin
@RequestMapping("/product")
public class ProductTypeRestController {

	@Autowired
	ProductTypeService productTypeService;
	
	@GetMapping(value = "/type", produces = MediaType.APPLICATION_JSON_VALUE)
	public Collection<ProductType> getProductType() {
		
		return productTypeService.getAllProductType();
	}
	
	@PostMapping(value = "/addType", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addProductType(@RequestBody ProductType productType) {
		
		productTypeService.addProductType(productType);
	}
}
