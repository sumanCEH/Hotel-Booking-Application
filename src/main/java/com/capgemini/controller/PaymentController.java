package com.capgemini.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.entity.Payment;
import com.capgemini.entity.service.PaymentService;

@RestController
public class PaymentController {
	
	@Autowired
	private PaymentService paymentService;
	
	@PostMapping("/add/payment")
	public Payment addPayment(@RequestBody Payment payment) {
		
		return paymentService.addPayment(payment);
	}

}
