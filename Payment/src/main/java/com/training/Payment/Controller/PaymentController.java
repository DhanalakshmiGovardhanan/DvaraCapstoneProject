package com.training.Payment.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.training.Payment.Entity.UserPayment;
import com.training.Payment.Service.PaymentService;

@RestController
public class PaymentController {
	
	
	private PaymentService paymentService;
	
	

	public PaymentController(PaymentService paymentService) {
		super();
		this.paymentService = paymentService;
	}

   
	
	@PostMapping("/savePayment")
	public ResponseEntity<UserPayment> postPrice(@RequestBody UserPayment  userPayment){
		userPayment=paymentService.savePayment(userPayment);
		return new ResponseEntity<UserPayment>(userPayment,HttpStatus.OK);
	}
}
