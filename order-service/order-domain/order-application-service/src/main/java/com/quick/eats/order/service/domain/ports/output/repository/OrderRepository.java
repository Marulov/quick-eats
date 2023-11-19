package com.quick.eats.order.service.domain.ports.output.repository;

import com.quick.eats.domain.valueobject.OrderId;
import com.quick.eats.order.service.domain.entity.Order;
import com.quick.eats.order.service.domain.valueobject.TrackingId;

import java.util.Optional;

public interface OrderRepository {

    Order save(Order order);

    Optional<Order> findById(OrderId orderId);

    Optional<Order> findByTrackingId(TrackingId trackingId);
}
