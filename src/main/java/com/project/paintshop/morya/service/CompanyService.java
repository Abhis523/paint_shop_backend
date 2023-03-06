package com.project.paintshop.morya.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.project.paintshop.morya.model.Company;
import com.project.paintshop.morya.repository.CompanyRepository;

@Service
public class CompanyService {

	@Autowired
	private CompanyRepository companyRepository;
	
	@Transactional(rollbackFor=Exception.class, timeout=5, propagation=Propagation.REQUIRED)
	public void AddCompany(Company company) {
		
		companyRepository.save(company);
	}
	
	public Collection<Company> getCompanyDetails() {
		
		return companyRepository.findAll();
	}
}
