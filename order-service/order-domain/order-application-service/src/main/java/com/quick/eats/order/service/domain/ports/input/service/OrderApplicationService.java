package com.quick.eats.order.service.domain.ports.input.service;

import com.quick.eats.order.service.domain.dto.create.CreateOrderCommand;
import com.quick.eats.order.service.domain.dto.create.CreateOrderResponse;
import com.quick.eats.order.service.domain.dto.track.TrackOrderQuery;
import com.quick.eats.order.service.domain.dto.track.TrackOrderResponse;

import javax.validation.Valid;

public interface OrderApplicationService {

    CreateOrderResponse createOrder(@Valid CreateOrderCommand createOrderCommand);

    TrackOrderResponse trackOrder(@Valid TrackOrderQuery trackOrderQuery);
}
