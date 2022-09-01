package com.capgemini.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.entity.Transaction;
import com.capgemini.entity.service.TransactionService;

@RestController
public class TransactionController {
	
	@Autowired
	private TransactionService transactionService;
	
	@GetMapping("/")
	public String home() {
		return "Welecome";
	}
	
	@PostMapping("/add/transaction")
	public Transaction addTransaction(@RequestBody Transaction transaction) {
		
		return transactionService.addTransaction(transaction);
		
	}
	
	

}
