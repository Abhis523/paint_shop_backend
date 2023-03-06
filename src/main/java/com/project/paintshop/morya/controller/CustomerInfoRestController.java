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

import com.project.paintshop.morya.model.CustomerInfo;
import com.project.paintshop.morya.service.CustomerInfoService;

@RestController
@CrossOrigin
@RequestMapping("/customer")
public class CustomerInfoRestController {

	@Autowired
	CustomerInfoService customerInfoService;
	
	@PostMapping( value = "/saveCust", consumes = MediaType.APPLICATION_JSON_VALUE )
	public CustomerInfo registerCustomerInfo( @RequestBody CustomerInfo customerInfo) {
		
		customerInfoService.registerCustomer(customerInfo);
		return customerInfo;
	}
	
	@GetMapping( value = "/allCust", produces = MediaType.APPLICATION_JSON_VALUE)
	public Collection<CustomerInfo> getAllCustomerInfo() {
		
		return customerInfoService.getAllCustomerInfo();
	}
	
	@PostMapping(value="/login", consumes = MediaType.APPLICATION_JSON_VALUE)
	public  Collection<CustomerInfo> loginCustomer(@RequestBody CustomerInfo customerInfo)
	{
		//System.out.printf("%s", customerInfo);
		 return customerInfoService.loginCustomer(customerInfo);
		 
	}
	
}
