package com.roger.customerFront.services;

import java.util.List;

import com.roger.customerFront.domain.PrimaryAccount;
import com.roger.customerFront.domain.PrimaryTransaction;
import com.roger.customerFront.domain.SavingsAccount;
import com.roger.customerFront.domain.SavingsTransaction;

public interface TransactionService {
	List<PrimaryTransaction> findPrimaryTransactionList(String username);

    List<SavingsTransaction> findSavingsTransactionList(String username);

    void savePrimaryDepositTransaction(PrimaryTransaction primaryTransaction);

    void saveSavingsDepositTransaction(SavingsTransaction savingsTransaction);
    
    void savePrimaryWithdrawTransaction(PrimaryTransaction primaryTransaction);
    
    void saveSavingsWithdrawTransaction(SavingsTransaction savingsTransaction);
    
    void betweenAccountsTransfer(String transferFrom, String transferTo, String amount, PrimaryAccount primaryAccount, SavingsAccount savingsAccount) throws Exception;
//    
//    List<Recipient> findRecipientList(Principal principal);
//
//    Recipient saveRecipient(Recipient recipient);
//
//    Recipient findRecipientByName(String recipientName);
//
//    void deleteRecipientByName(String recipientName);
//    
//    void toSomeoneElseTransfer(Recipient recipient, String accountType, String amount, PrimaryAccount primaryAccount, SavingsAccount savingsAccount);


}
