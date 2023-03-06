package com.project.paintshop.morya.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.paintshop.morya.model.Products;

public interface ProductsRepository extends JpaRepository<Products, Integer> {

}
