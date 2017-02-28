package com.roger.customerFront.dao;

import org.springframework.data.repository.CrudRepository;

import com.roger.customerFront.domain.SavingsAccount;

public interface SavingsAccountDao extends CrudRepository<SavingsAccount, Long>{
	
	SavingsAccount findByAccountNumber (int accountNumber);
	
}