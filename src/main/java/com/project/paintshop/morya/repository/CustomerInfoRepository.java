package com.project.paintshop.morya.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.paintshop.morya.model.CustomerInfo;

//jpaRepository is the interface
//with help of these we can avoid repeated code of dao class
//there is no need to write dao class when we use these interface or when we extend class with jpaRepository interface

public interface CustomerInfoRepository extends JpaRepository<CustomerInfo, Integer> {

	//Repository
	//CrudRepository
	//PagingAndSortingRepository
	//JpaRepository
}
