package com.quick.eats.order.service.domain.ports.output.repository;

import com.quick.eats.order.service.domain.entity.Restaurant;

import java.util.Optional;

public interface RestaurantRepository {

    Optional<Restaurant> findRestaurantInformation(Restaurant restaurant);
}
