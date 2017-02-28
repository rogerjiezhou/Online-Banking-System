package com.roger.customerFront.dao;

import org.springframework.data.repository.CrudRepository;

import com.roger.customerFront.domain.CheckingAccount;

public interface CheckingAccountDao extends CrudRepository<CheckingAccount, Long>{
	
	CheckingAccount findByAccountNumber (int accountNumber);
	
}
