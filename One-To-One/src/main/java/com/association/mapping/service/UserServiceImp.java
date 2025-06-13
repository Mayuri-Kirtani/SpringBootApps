package com.association.mapping.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.association.mapping.entity.User;
import com.association.mapping.repo.UserRepo;

@Service
public class UserServiceImp implements UserService {

	@Autowired
	private UserRepo repo;
	
	@Override
	public User addUser(User user) {
		return  repo.save(user);		

	}

	@Override
	public List<User> getAllUser() {
		
		return repo.findAll();
	}

	@Override
	public Optional<User> getUserById(int id) {
		
		return repo.findById(id);
	}

}
