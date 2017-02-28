package com.roger.customerFront.services;

import java.security.Principal;


import com.roger.customerFront.domain.CheckingAccount;
import com.roger.customerFront.domain.SavingsAccount;

public interface AccountService {
	
	CheckingAccount createCheckingAccount();
	SavingsAccount createSavingsAccount();
	
}
