package com.example.demo.repository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
	
	public List<User> findAll();
	public Optional<User> findUserById(long id);
	public Optional<User> findUserByUserName(String username);
	 
}
