package com.roger.customerFront.dao;

import org.springframework.data.repository.CrudRepository;

import com.roger.customerFront.domain.Customer;

public interface CustomerDAO extends CrudRepository<Customer, Long>{
	
	Customer findByUsername(String username);
	Customer findByEmail(String email);
	
}
