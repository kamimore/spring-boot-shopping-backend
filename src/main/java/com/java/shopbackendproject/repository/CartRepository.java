package com.java.shopbackendproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.shopbackendproject.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {

    Cart findByUserId(Long userId);

}
