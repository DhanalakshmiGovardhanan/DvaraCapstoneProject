package com.example.ecommerce.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="price")
public class Price {
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Integer pid;
	

	private Integer Cost_Price;
	
	
	private Integer Selling_Price;
	
	
	private Integer Tax;

	private Integer Discount;
	
	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public Integer getCost_Price() {
		return Cost_Price;
	}

	public void setCost_Price(Integer cost_Price) {
		Cost_Price = cost_Price;
	}

	public Integer getSelling_Price() {
		return Selling_Price;
	}

	public void setSelling_Price(Integer selling_Price) {
		Selling_Price = selling_Price;
	}

	public Integer getTax() {
		return Tax;
	}

	public void setTax(Integer tax) {
		Tax = tax;
	}

	public Integer getDiscount() {
		return Discount;
	}

	public void setDiscount(Integer discount) {
		Discount = discount;
	}

	public Price(Integer pid, Integer cost_Price, Integer selling_Price, Integer tax, Integer discount) {
		super();
		this.pid = pid;
		Cost_Price = cost_Price;
		Selling_Price = selling_Price;
		Tax = tax;
		Discount = discount;
	}
	
	public Price() {
		
	}

	

	
	
	
	
	

}
