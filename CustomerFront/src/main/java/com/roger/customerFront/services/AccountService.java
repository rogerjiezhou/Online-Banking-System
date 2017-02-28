package com.roger.customerFront.services;

import java.security.Principal;


import com.roger.customerFront.domain.PrimaryAccount;
import com.roger.customerFront.domain.SavingsAccount;

public interface AccountService {
	
	PrimaryAccount createPrimaryAccount();
	SavingsAccount createSavingsAccount();
	void deposit(String accountType, double parseDouble, Principal principal);
	void withdraw(String accountType, double parseDouble, Principal principal);
	
}
