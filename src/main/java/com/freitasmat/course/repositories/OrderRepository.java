package com.freitasmat.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.freitasmat.course.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{

}
