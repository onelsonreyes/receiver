package com.karadak.eventuate.receiver.backend.subscriber;

import com.karadak.eventuate.receiver.backend.event.RestaurantCreatedEvent;
import com.karadak.eventuate.receiver.backend.service.RestaurantQueryService;
import io.eventuate.DispatchedEvent;
import io.eventuate.EventHandlerMethod;
import io.eventuate.EventSubscriber;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
@EventSubscriber(id = "restaurantQuerySideEventHandlers")
public class RestaurantViewEventSubscriber {

    private RestaurantQueryService restaurantQueryService;

    public RestaurantViewEventSubscriber(RestaurantQueryService restaurantQueryService) {
        this.restaurantQueryService = restaurantQueryService;
    }

    @EventHandlerMethod
    public void create(DispatchedEvent<RestaurantCreatedEvent> dispatchedEvent) {
        final String key = restaurantQueryService.getKey();
        final RestaurantCreatedEvent restaurantCreatedEvent = dispatchedEvent.getEvent();
        log.error("This is the restaurante event " + dispatchedEvent.getEntityId());
        log.error("event ----> " + restaurantCreatedEvent);
    }
}
