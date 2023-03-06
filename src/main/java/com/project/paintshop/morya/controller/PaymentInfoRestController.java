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

import com.project.paintshop.morya.model.PaymentInfo;
import com.project.paintshop.morya.service.PaymentInfoService;

@RestController
@CrossOrigin
@RequestMapping("/payment")
public class PaymentInfoRestController {

	@Autowired
	private PaymentInfoService paymentInfoService;
	
	@GetMapping(value = "/info", produces = MediaType.APPLICATION_JSON_VALUE)
	public Collection<PaymentInfo> getAllPaymentInfo() {
		
		return paymentInfoService.getAllPaymentInfo();
	}
	
	@PostMapping(value = "/saveInfo", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void savePaymentInfo(@RequestBody PaymentInfo paymentInfo) {
		
		paymentInfoService.SavePaymentInfo(paymentInfo);
	}
}
