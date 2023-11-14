package com.quick.eats.order.service.domain.valueobject;

import com.quick.eats.domain.valueobject.BaseId;

import java.util.UUID;

public class TrackingId extends BaseId<UUID> {

    public TrackingId(UUID value) {
        super(value);
    }
}
