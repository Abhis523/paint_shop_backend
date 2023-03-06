package com.project.paintshop.morya.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.project.paintshop.morya.dao.OrdersDao;
import com.project.paintshop.morya.model.Orders;

@Service
public class OrdersService {

	@Autowired
	OrdersDao ordersDao;
	
	public Collection<Orders> getAllOrders() {
		
		return ordersDao.getAllOrderDetails();
	}
	
	@Transactional(rollbackFor=Exception.class, timeout=5, propagation=Propagation.REQUIRED)
	public void addOrders( Orders orders) {
		
		ordersDao.addOrder(orders);
	}
}
