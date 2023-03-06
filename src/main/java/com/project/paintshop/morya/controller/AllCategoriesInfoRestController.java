package com.project.paintshop.morya.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.paintshop.morya.model.AllCategoriesInfo;
import com.project.paintshop.morya.service.AllCategoriesInfoService;

@RestController
@CrossOrigin
@RequestMapping("/allCat")
public class AllCategoriesInfoRestController {

	@Autowired
	AllCategoriesInfoService allCategoriesInfoService;
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public Collection<AllCategoriesInfo> getAllCatagoriesInfo() {
		
		return allCategoriesInfoService.getAllCategoriesInfo();
	}
}
