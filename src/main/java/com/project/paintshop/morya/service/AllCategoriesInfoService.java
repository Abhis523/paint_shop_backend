package com.project.paintshop.morya.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.paintshop.morya.model.AllCategoriesInfo;
import com.project.paintshop.morya.repository.AllCategoriesInfoRepository;

@Service
public class AllCategoriesInfoService {

	@Autowired
	private AllCategoriesInfoRepository allCategoriesInfoRepository;
	
	public Collection<AllCategoriesInfo> getAllCategoriesInfo() {
		
		return allCategoriesInfoRepository.findAll();
	}
}
