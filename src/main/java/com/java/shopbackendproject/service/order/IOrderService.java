package com.java.shopbackendproject.service.order;

import java.util.List;

import com.java.shopbackendproject.dto.OrderDto;
import com.java.shopbackendproject.model.Order;

public interface IOrderService {
    Order placeOrder(Long userId);

    OrderDto getOrder(Long orderId);

    List<OrderDto> getUserOrders(Long userId);

    OrderDto convertToDto(Order order);
}
