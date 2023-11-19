package com.quick.eats.order.service.domain.ports.output.message.publisher.restaurantapproval;

import com.quick.eats.domain.event.publisher.DomainEventPublisher;
import com.quick.eats.order.service.domain.event.OrderPaidEvent;

public interface OrderPaiRestaurantRequestMessagePublisher extends DomainEventPublisher<OrderPaidEvent> {
}
