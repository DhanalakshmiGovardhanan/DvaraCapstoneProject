package com.sample.UserAddress.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class User {
	
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String username;
  
 @OneToMany(mappedBy = "user", cascade = CascadeType.ALL,orphanRemoval = true)
 @JsonManagedReference
 private List<AddressEntity> addresses = new ArrayList<>();

  public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<AddressEntity> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<AddressEntity> addresses) {
		this.addresses = addresses;
	}
    
}
