package com.roger.cutomerFront.domain;

import java.math.BigDecimal;
import java.util.List;

public class CheckingAccount {
	
	private Long id;
	private int accountNumber;
	private BigDecimal accountBalance;
	private List<CheckingTransaction> checkingTransactionList;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public BigDecimal getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(BigDecimal accountBalance) {
		this.accountBalance = accountBalance;
	}


	public List<CheckingTransaction> getCheckingTransactionList() {
		return checkingTransactionList;
	}

	public void setCheckingTransactionList(List<CheckingTransaction> checkingTransactionList) {
		this.checkingTransactionList = checkingTransactionList;
	}

	@Override
	public String toString() {
		return "PrimaryAccount [id=" + id + ", accountNumber=" + accountNumber + ", accountBalance=" + accountBalance
				+ "]";
	}
	
	
}
