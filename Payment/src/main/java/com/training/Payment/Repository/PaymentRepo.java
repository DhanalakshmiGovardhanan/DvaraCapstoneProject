package com.training.Payment.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.Payment.Entity.UserPayment;


@Repository
public interface PaymentRepo  extends JpaRepository<UserPayment, Integer>{

}
