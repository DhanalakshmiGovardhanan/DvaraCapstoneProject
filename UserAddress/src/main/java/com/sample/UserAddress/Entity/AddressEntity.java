package com.sample.UserAddress.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class AddressEntity {
  

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String street;
    private String city;
    
    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonBackReference
    private User user;
    
    public Long getId() {
  		return id;
  	}

  	public void setId(Long id) {
  		this.id = id;
  	}

  	public String getStreet() {
  		return street;
  	}

  	public void setStreet(String street) {
  		this.street = street;
  	}

  	public String getCity() {
  		return city;
  	}

  	public void setCity(String city) {
  		this.city = city;
  	}

  	public User getUser() {
  		return user;
  	}

  	public void setUser(User user) {
  		this.user = user;
  	}
}
    
    
