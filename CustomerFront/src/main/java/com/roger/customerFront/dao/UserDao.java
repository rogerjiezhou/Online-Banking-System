package com.roger.customerFront.dao;

import org.springframework.data.repository.CrudRepository;

import com.roger.customerFront.domain.User;

public interface UserDao extends CrudRepository<User, Long>{
	
	User findByUsername(String username);
	User findByEmail(String email);
	
}
