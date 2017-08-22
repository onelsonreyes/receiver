package com.karadak.eventuate.receiver.backend.config;

import com.karadak.eventuate.receiver.backend.service.RestaurantQueryService;
import com.karadak.eventuate.receiver.backend.subscriber.RestaurantViewEventSubscriber;
import io.eventuate.javaclient.spring.EnableEventHandlers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan
@EnableEventHandlers
@Import({RestaurantQueryService.class})
public class RestaurantViewBackendConfig {
    @Bean
    public RestaurantViewEventSubscriber restaurantViewEventSubscriber(RestaurantQueryService queryService) {
        return new RestaurantViewEventSubscriber(queryService);
    }

}
