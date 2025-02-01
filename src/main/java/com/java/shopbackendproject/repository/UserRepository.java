package com.java.shopbackendproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.shopbackendproject.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
    Boolean existsByEmail(String email);
}
