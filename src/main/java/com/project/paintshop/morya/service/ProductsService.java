package com.project.paintshop.morya.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.project.paintshop.morya.dao.ProductDao;
import com.project.paintshop.morya.model.Products;

@Service
public class ProductsService {

//	@Autowired
//	ProductsRepository productsRepository;
	
	@Autowired
	ProductDao productDao;
	
	public Collection<Products> getAllProducts() {
		
		return productDao.getAllProducts();
	}
	
	@Transactional(rollbackFor=Exception.class, timeout=5, propagation=Propagation.REQUIRED)
	public void addProducts( Products products) {
		
		productDao.AddProduts(products);
	}
}
