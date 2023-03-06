package com.project.paintshop.morya.dao;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.project.paintshop.morya.model.Counter;
import com.project.paintshop.morya.model.Orders;

@Repository
public class OrdersDao {

	@PersistenceContext
	EntityManager entityManager;
	
	public Collection<Orders> getAllOrderDetails() {
		
		return entityManager.createQuery("From Orders",Orders.class).getResultList();
	}
	
	
	public void addOrder( Orders orders) {
		
		System.out.println(orders);
		
	     Counter ctr = entityManager.find(Counter.class, "order");
	     
	     String abc = "ORD" + ctr.nextValue();
		
	      orders.setOrderId(abc);
	      orders.setCustId(orders.getCustId());
	      orders.setProductId(orders.getProductId());
	      orders.setQuantity(orders.getQuantity());
	      orders.setTotalCost(orders.getTotalCost());
	      orders.setOrderDate(orders.getOrderDate());
		
		entityManager.persist(orders);
	}
}
