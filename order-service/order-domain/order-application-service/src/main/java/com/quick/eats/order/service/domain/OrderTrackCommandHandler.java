package com.quick.eats.order.service.domain;

import com.quick.eats.order.service.domain.dto.track.TrackOrderQuery;
import com.quick.eats.order.service.domain.dto.track.TrackOrderResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class OrderTrackCommandHandler {

    public TrackOrderResponse trackOrder(TrackOrderQuery trackOrderQuery) {
        return null;
    }
}
