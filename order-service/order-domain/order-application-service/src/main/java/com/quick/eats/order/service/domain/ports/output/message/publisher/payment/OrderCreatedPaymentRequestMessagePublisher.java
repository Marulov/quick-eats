package com.quick.eats.order.service.domain.ports.output.message.publisher.payment;

import com.quick.eats.domain.event.publisher.DomainEventPublisher;
import com.quick.eats.order.service.domain.event.OrderCreatedEvent;

public interface OrderCreatedPaymentRequestMessagePublisher extends DomainEventPublisher<OrderCreatedEvent> {
}
