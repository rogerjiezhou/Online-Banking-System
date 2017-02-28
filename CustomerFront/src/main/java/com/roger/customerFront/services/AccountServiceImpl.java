package com.roger.customerFront.services;

import java.math.BigDecimal;
import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roger.customerFront.dao.CheckingAccountDao;
import com.roger.customerFront.dao.SavingsAccountDao;
import com.roger.customerFront.domain.CheckingAccount;
import com.roger.customerFront.domain.SavingsAccount;

@Service
public class AccountServiceImpl implements AccountService {

	private static int nextAccountNumber = 11223145;

    @Autowired
    private CheckingAccountDao checkingAccountDao;

    @Autowired
    private SavingsAccountDao savingsAccountDao;

    @Autowired
    private CustomerService customerService;
    
//    @Autowired
//    private TransactionService transactionService;

    public CheckingAccount createCheckingAccount() {
        CheckingAccount primaryAccount = new CheckingAccount();
        primaryAccount.setAccountBalance(new BigDecimal(0.0));
        primaryAccount.setAccountNumber(accountGen());

        checkingAccountDao.save(primaryAccount);

        return checkingAccountDao.findByAccountNumber(primaryAccount.getAccountNumber());
    }

    public SavingsAccount createSavingsAccount() {
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.setAccountBalance(new BigDecimal(0.0));
        savingsAccount.setAccountNumber(accountGen());

        savingsAccountDao.save(savingsAccount);

        return savingsAccountDao.findByAccountNumber(savingsAccount.getAccountNumber());
    }
    
    private int accountGen() {
        return ++nextAccountNumber;
    }
    
}