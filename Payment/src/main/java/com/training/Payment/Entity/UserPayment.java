package com.training.Payment.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="payment")
public class UserPayment {
		
	@Id
	private Integer User_id;
	
	private String UPI;
	
	private String Net_Banking;
	
	private String COD;

	public Integer getUser_id() {
		return User_id;
	}

	public void setUser_id(Integer user_id) {
		User_id = user_id;
	}

	public String getUPI() {
		return UPI;
	}

	public void setUPI(String uPI) {
		UPI = uPI;
	}

	public String getNet_Banking() {
		return Net_Banking;
	}

	public void setNet_Banking(String net_Banking) {
		Net_Banking = net_Banking;
	}

	public String getCOD() {
		return COD;
	}

	public void setCOD(String cOD) {
		COD = cOD;
	}

	
	
	

	public UserPayment() {
	
	}

	public UserPayment(Integer user_id, String uPI, String net_Banking, String cOD) {
		super();
		User_id = user_id;
		UPI = uPI;
		Net_Banking = net_Banking;
		COD = cOD;
	}
	
	
	

}
