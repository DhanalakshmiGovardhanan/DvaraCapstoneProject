package com.sample.UserAddress.Service;

import java.util.List;

import org.apache.tomcat.jni.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.UserAddress.Entity.AddressEntity;
import com.sample.UserAddress.Entity.User;
import com.sample.UserAddress.Repository.AddressRepository;

@Service
public class AddressService {
    @Autowired
    private AddressRepository addressRepository;

    public AddressEntity createAddress(AddressEntity address) {
        return addressRepository.save(address);
    }

    public List<AddressEntity> getAllAddresses() {
        return addressRepository.findAll();
    }

    public AddressEntity getAddressById(Long id) {
        return addressRepository.findById(id).orElse(null);
    }
    
//    public AddressEntity updateUser(Long id, AddressEntity updatedUser) {
//        AddressEntity existingUser = addressRepository.findById(id).orElse(null);
//        if (existingUser != null) {
//           // existingUser.setUsername(updatedUser.getUsername());
//            existingUser.setAddresses(updatedUser.getAddresses());
//            return addressRepository.save(existingUser);
//        }
//        return null;
//    }

    public void deleteAddress(Long id) {
        addressRepository.deleteById(id);
    }
}
