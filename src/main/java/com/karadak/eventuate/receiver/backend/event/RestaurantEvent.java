package com.karadak.eventuate.receiver.backend.event;

import io.eventuate.Event;
import io.eventuate.EventEntity;
@EventEntity(entity = "com.karadak.eventuate.receiver.backend.aggregate.RestaurantAggregate")
public abstract class RestaurantEvent implements Event {
}
