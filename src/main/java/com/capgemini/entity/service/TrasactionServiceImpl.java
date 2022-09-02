package com.capgemini.entity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.entity.Transaction;
import com.capgemini.entity.repository.TransactionRepository;

@Service
public class TrasactionServiceImpl implements TransactionService {
	
	@Autowired
	private TransactionRepository transactionRepository;

	@Override
	public Transaction addTransaction(Transaction transaction) {
		
		return transactionRepository.save(transaction);
		
	}

}
