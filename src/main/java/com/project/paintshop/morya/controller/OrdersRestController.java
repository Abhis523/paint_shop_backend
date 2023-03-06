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

import com.project.paintshop.morya.model.Orders;
import com.project.paintshop.morya.service.OrdersService;

@RestController
@CrossOrigin
@RequestMapping("/order")
public class OrdersRestController {

	@Autowired
	OrdersService ordersService;
	
	@GetMapping(value = "/getAll", produces = MediaType.APPLICATION_JSON_VALUE)
	public Collection<Orders> getAllOrders() {
		
		return ordersService.getAllOrders();
	}
	
	@PostMapping(value = "/addOrd", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addOrders( @RequestBody Orders orders) {
		
		ordersService.addOrders(orders);
	}
}
