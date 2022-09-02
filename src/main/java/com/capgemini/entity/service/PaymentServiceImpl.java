package com.capgemini.entity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.entity.Payment;
import com.capgemini.entity.repository.PaymentRepository;

@Service
public class PaymentServiceImpl implements PaymentService {
	@Autowired
	private PaymentRepository paymentRepository;

	@Override
	public Payment addPayment(Payment payment) {
		return paymentRepository.save(payment);
	}

}
