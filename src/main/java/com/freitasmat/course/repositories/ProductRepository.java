package com.freitasmat.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.freitasmat.course.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{

}
