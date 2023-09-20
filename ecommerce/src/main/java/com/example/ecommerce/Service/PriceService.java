package com.example.ecommerce.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.ecommerce.Entity.Price;
import com.example.ecommerce.Repository.PriceRepo;

@Service
public class PriceService {
	
	@Autowired
	private PriceRepo priceRepo;
	
	public PriceService(PriceRepo priceRepo) {
		super();
		this.priceRepo = priceRepo;
	}

	public Price savePrice(Price price) {
		price=priceRepo.save(price);
		return price;
		
	}
	public List<Price> fetchAllPrice(){
		return priceRepo.fetchAll();
	}
	
	public Price fetchOnePrice(){
		return priceRepo.fetchOne(2);
	}
	
	public Price fetchOneById(){
		return priceRepo.fetchOneByName(2,45);
	}
	
	public Price fetchOneByCP(Integer cost_price){
		return priceRepo.fetchCP(cost_price);
	}
	
	public Integer updateSp() {
		return priceRepo.updateSellingPrice();
		
	}
	
}
