package com.quick.eats.order.service.domain.valueobject;

import com.quick.eats.domain.valueobject.BaseId;

public class OrderItemId extends BaseId<Long> {

    public OrderItemId(Long value) {
        super(value);
    }
}
