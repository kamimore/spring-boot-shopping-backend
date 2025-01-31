package com.java.shopbackendproject.service.cart;

import java.math.BigDecimal;

import com.java.shopbackendproject.model.Cart;

public interface ICartService {

    Cart getCart(Long id);

    void clearCart(Long id);

    BigDecimal getTotalPrice(Long id);
}
