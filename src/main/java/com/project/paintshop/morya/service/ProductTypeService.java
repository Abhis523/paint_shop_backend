package com.project.paintshop.morya.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.project.paintshop.morya.model.ProductType;
import com.project.paintshop.morya.repository.ProductTypeRepository;

@Service
public class ProductTypeService {

	@Autowired
	private ProductTypeRepository productTypeRepository;
	
	@Transactional(rollbackFor=Exception.class, timeout=5, propagation=Propagation.REQUIRED)
	public void addProductType( ProductType productType) {
		
		productTypeRepository.save(productType);
	}
	
	public Collection<ProductType> getAllProductType() {
		
		return productTypeRepository.findAll();
	}
}
