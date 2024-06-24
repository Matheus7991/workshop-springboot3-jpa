package com.freitasmat.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.freitasmat.course.entities.User;


public interface UserRepository extends JpaRepository<User, Long>{

}
