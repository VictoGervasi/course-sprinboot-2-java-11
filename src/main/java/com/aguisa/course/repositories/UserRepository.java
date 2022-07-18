package com.aguisa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aguisa.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
