package com.quick.eats.domain.event.publisher;

import com.quick.eats.domain.event.DomainEvent;

public interface DomainEventPublisher<T extends DomainEvent> {

    void publish(T event);
}
