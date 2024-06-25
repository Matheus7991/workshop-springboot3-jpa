package com.freitasmat.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.freitasmat.course.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long>{

}
