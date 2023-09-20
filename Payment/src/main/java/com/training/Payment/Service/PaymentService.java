package com.training.Payment.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.training.Payment.Entity.UserPayment;
import com.training.Payment.Repository.PaymentRepo;

@Service
public class PaymentService {
	

	@Autowired
	private PaymentRepo paymentRepo;
	
	public PaymentService(PaymentRepo paymentRepo) {
		super();
		this.paymentRepo = paymentRepo;
	}

	
	public UserPayment savePayment(UserPayment userPayment) {
		userPayment=paymentRepo.save(userPayment);
		return userPayment;
		
	}

}
