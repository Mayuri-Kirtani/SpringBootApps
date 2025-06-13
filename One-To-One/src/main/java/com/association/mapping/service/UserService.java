package com.association.mapping.service;

import java.util.List;
import java.util.Optional;

import com.association.mapping.entity.User;

public interface UserService {

	public User addUser(User user);
	public List<User> getAllUser();
	public Optional<User> getUserById(int id);
}
