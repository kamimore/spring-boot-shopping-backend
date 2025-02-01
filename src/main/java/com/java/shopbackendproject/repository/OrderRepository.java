package com.java.shopbackendproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.shopbackendproject.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
