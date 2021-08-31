package com.example.demo.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;

import com.example.demo.controllers.UserController;
import com.example.demo.models.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	private static Logger logger= LoggerFactory.getLogger(UserController.class);
	
	@PutMapping(value="/UserService/login/{id}")
	public void logInUser(long id) {
		Optional<User> user= userRepository.findUserById(id);
		
		user.get().setLoggedin(true);
		
		if(user.get().isLoggedin()==true) {
			logger.info("User with id: " + id+ " is logged in");
		}else {
			logger.info("Failed to log in User: "+id);
		}
		
	}

	@PutMapping(value="/UserService/logout/{id}")
	public void logOutUser(long id) {
		Optional<User> user=userRepository.findById(id);
		
		user.get().setLoggedin(false);
		
		if(user.get().isLoggedin()==false) {
			logger.info("User with id: " + id+ " is logged out");
		}else {
			logger.info("Failed to log out User: "+id);
		}
		
	}
	
}
