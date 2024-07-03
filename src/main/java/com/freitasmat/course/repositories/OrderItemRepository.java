package com.freitasmat.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.freitasmat.course.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
