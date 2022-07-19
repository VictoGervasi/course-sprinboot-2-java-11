package com.aguisa.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aguisa.course.entities.User;
import com.aguisa.course.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> optional = repository.findById(id);
		return optional.get();
	}
	
	public User insert(User obj) {
		return repository.save(obj);	
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
}
