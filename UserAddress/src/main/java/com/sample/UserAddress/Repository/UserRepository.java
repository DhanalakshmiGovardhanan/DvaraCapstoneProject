package com.sample.UserAddress.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sample.UserAddress.Entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
}
