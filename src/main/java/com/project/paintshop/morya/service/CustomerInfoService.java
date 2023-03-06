package com.project.paintshop.morya.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.project.paintshop.morya.dao.CustomerDao;
import com.project.paintshop.morya.model.CustomerInfo;

@Service
public class CustomerInfoService {

//	@Autowired
//	private CustomerInfoRepository customerInfoRepository;
	
	@Autowired
	private CustomerDao customerDao;
	
	@Transactional(rollbackFor=Exception.class, timeout=5, propagation=Propagation.REQUIRED)
	public void registerCustomer(CustomerInfo customerInfo) {
		
		customerDao.registerCustomer(customerInfo);
	}
	
	public Collection<CustomerInfo> getAllCustomerInfo() {
		
		return customerDao.getAllCustomers();
	}
	
	@Transactional(rollbackFor=Exception.class, timeout=5, propagation=Propagation.REQUIRED)
	public Collection<CustomerInfo> loginCustomer(CustomerInfo customerInfo){
		
		return customerDao.loginCustomer(customerInfo);
	}
}
