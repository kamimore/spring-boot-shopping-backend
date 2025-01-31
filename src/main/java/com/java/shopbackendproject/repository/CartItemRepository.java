package com.java.shopbackendproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.shopbackendproject.model.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {

    void deleteAllByCartId(Long id);
}
