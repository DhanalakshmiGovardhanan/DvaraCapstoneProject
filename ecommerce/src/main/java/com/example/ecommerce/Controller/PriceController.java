package com.example.ecommerce.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.example.ecommerce.Entity.Price;
import com.example.ecommerce.Service.PriceService;

@RestController
public class PriceController {
	
   
	private PriceService priceService;

	
	public PriceController(PriceService priceService) {
		super();
		this.priceService = priceService;
	}
	
	@PostMapping("/savePrice")
	public ResponseEntity<Price> postPrice(@RequestBody Price price){
		price=priceService.savePrice(price);
		return new ResponseEntity<Price>(price,HttpStatus.OK);
	}
	
	@GetMapping("/getall") 
	public List<Price> fetch(){
		return priceService.fetchAllPrice();
	}
	
	@GetMapping("/getOne") 
	public Price fetchOneById(){
		return priceService.fetchOnePrice();
	}

	@GetMapping("/getOneById") 
	public Price fetchOneByIdAndName(){
		return priceService.fetchOneById();
	}
	
	@GetMapping("/getOneByCP/{cost_price}") 
	public Price fetchOneByCP(@PathVariable Integer cost_price ){
		return priceService.fetchOneByCP(cost_price);
	}
	
	@PostMapping("/put")
	public Integer updateSellingPrice() {
	  return priceService.updateSp();
	}
}
