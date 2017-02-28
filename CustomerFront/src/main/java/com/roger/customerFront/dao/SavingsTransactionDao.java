package com.roger.customerFront.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.roger.customerFront.domain.SavingsTransaction;

public interface SavingsTransactionDao extends CrudRepository<SavingsTransaction, Long> {

    List<SavingsTransaction> findAll();
}

