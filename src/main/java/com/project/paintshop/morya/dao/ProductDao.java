package com.project.paintshop.morya.dao;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.project.paintshop.morya.model.Counter;
import com.project.paintshop.morya.model.Products;

@Repository
public class ProductDao {

	@PersistenceContext
	EntityManager entityManager;
	
	public Collection<Products> getAllProducts() {
		
		try {
			return entityManager.createQuery("From Products",Products.class ).getResultList();
		}
		catch (Exception e) {
			// TODO: handle exception
			throw new RuntimeException(e);
		}
	}
	
	
	public void AddProduts( Products products) {
		try {
			Counter ctr = entityManager.find(Counter.class, "product");
			Counter ct = entityManager.find(Counter.class, "productInfo");
			
			
			        String abc = "PRD" + ctr.nextValue();
			        String cba = "INFO" + ct.nextValue();
			        
			        products.setProductId(abc);
			        products.setProductName(products.getProductName());
			        products.setProductTypeId(products.getProductTypeId());
			        products.setImagePath(products.getImagePath());
			        products.setDescription(products.getDescription());
			        products.setProductInfoId(cba);
			        products.setTotalStock(products.getTotalStock());
			        products.setPrice(products.getPrice());
			        products.setTotalPrice(products.getTotalPrice());
			        
//			    	private String productId;
//			    	private String productName;
//			    	private String productTypeId;
//			    	private String imagePath;
//			    	private String description;
//			    	
//			    	private String productInfoId;
//			    	private Integer totalStock;
//			    	private Integer unitPrice;
//			    	private Integer totalPrice;
					
		entityManager.persist(products);
	}
	catch (Exception e) 
	{
		throw new RuntimeException(e);
	}
	}
}
