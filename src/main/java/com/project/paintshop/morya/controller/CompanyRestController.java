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

import com.project.paintshop.morya.model.Company;
import com.project.paintshop.morya.service.CompanyService;

@RestController
@CrossOrigin
@RequestMapping("/company")
public class CompanyRestController {

	@Autowired
	CompanyService companyService;
	
	@GetMapping(value = "/details", produces = MediaType.APPLICATION_JSON_VALUE)
	public Collection<Company> getCompanyDetails() {
		
		return companyService.getCompanyDetails();
	}
	
	@PostMapping(value="/addCompany", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addCompany(@RequestBody Company company) {
		
		companyService.AddCompany(company);
	}
}
