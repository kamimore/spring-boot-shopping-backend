package com.java.shopbackendproject.service.order;

import com.java.shopbackendproject.model.Order;

public interface IOrderService {
    Order placeOrder(Long userId);

    Order getOrder(Long orderId);
}
