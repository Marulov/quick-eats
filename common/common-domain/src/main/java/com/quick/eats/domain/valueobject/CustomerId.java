package com.quick.eats.domain.valueobject;

import java.util.UUID;

public class CustomerId extends BaseId<UUID>{
    public CustomerId(UUID value) {
        super(value);
    }
}
