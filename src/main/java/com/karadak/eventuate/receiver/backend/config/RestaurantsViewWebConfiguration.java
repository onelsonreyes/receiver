package com.karadak.eventuate.receiver.backend.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan
@Import({RestaurantViewBackendConfig.class, WebConfiguration.class})
public class RestaurantsViewWebConfiguration {
}
