package com.roger.customerFront.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.roger.customerFront.domain.PrimaryTransaction;

public interface PrimaryTransactionDao extends CrudRepository<PrimaryTransaction, Long> {

    List<PrimaryTransaction> findAll();
}
