package com.association.mapping.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.association.mapping.entity.User;
import com.association.mapping.service.UserService;

@Controller
@RequestMapping("api/user")
public class UserController {
	
	@Autowired
	private UserService userservice;
	
	@PostMapping("/Add")
	public User saveUSer(User user) {
		return userservice.addUser(user);
	}
	
	@GetMapping("/{id}")
	public Optional<User> getUserById(int id) {
		Optional<User> userid =userservice.getUserById(id);
		if(userid.isPresent()){
			System.out.println("Record found");
		}else {
			System.out.println("Record not found");
		}
		return userid; 		
	}
	@GetMapping("/All")
	public List<User> getAllUser(){
		List<User> users=userservice.getAllUser();
		return users;		
	}

}
