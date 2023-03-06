package com.project.paintshop.morya.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.project.paintshop.morya.model.PaymentInfo;
import com.project.paintshop.morya.repository.PaymentInfoRepository;

@Service
public class PaymentInfoService {

	@Autowired
	private PaymentInfoRepository paymentInfoRepository;
	
	@Transactional(rollbackFor=Exception.class, timeout=5, propagation=Propagation.REQUIRED)
	public void SavePaymentInfo( PaymentInfo paymentInfo) {
		
		paymentInfoRepository.save( paymentInfo);
	}
	
	public Collection<PaymentInfo> getAllPaymentInfo() {
		
		return paymentInfoRepository.findAll();
	}
}
