package com.quick.eats.order.service.domain;

import com.quick.eats.order.service.domain.entity.Order;
import com.quick.eats.order.service.domain.entity.Restaurant;
import com.quick.eats.order.service.domain.event.OrderCancelledEvent;
import com.quick.eats.order.service.domain.event.OrderCreatedEvent;
import com.quick.eats.order.service.domain.event.OrderPaidEvent;

import java.util.List;

public interface OrderDomainService {

    OrderCreatedEvent validateAndInitiateOrder(Order order, Restaurant restaurant);

    OrderPaidEvent payOrder(Order order);

    void approveOrder(Order order);

    OrderCancelledEvent cancelOrderPayment(Order order, List<String> failureMessages);

    void cancelOrder(Order order, List<String> failureMessages);
}
