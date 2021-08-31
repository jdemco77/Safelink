package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.User;
import com.example.demo.repository.UserRepository;

@RestController
public class UserController {
	
	
	private static Logger logger= LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserRepository userRepository;

	//works
	@PostMapping(value="/CreateUser")
	public User CreateNewUser( @RequestBody User user){
		userRepository.save(user);
		return user;
	}
	//works 
	@GetMapping(value="/User/{id}")
	public Optional<User> findUserById(@PathVariable long id) {
		
		Optional<User> user= userRepository.findUserById(id);
		
		if(user.isPresent()) {
			return user;
		}
			
		String message= "No User with id: "+id;
		logger.error(message);
		
		return null;
	}
	//works
	@GetMapping(value="/User/ByUsername/{username}")
	public Optional<User> findUserByUsername(@PathVariable String username) {
		
		Optional<User> user= userRepository.findUserByUserName(username);
		
		if(user.isPresent()) {
			return Optional.of(user.get());
		}
			
		String message= "No User with username: "+username;
		logger.error(message);
		
		return null;
	}
	//works
	@GetMapping("Users")
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}
	
	@DeleteMapping(value="/User/delete/{userid}")
	public void deleteUser(@PathVariable long userid) {
		userRepository.deleteById(userid);
		
		if(userRepository.findById(userid).isPresent()) {
			logger.info("User Deleted, id: "+ userid, userRepository, logger);
		}
		
	}
	
}
