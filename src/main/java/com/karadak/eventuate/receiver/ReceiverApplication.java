package com.karadak.eventuate.receiver;

import com.karadak.eventuate.receiver.backend.config.RestaurantViewBackendConfig;
import io.eventuate.javaclient.driver.EventuateDriverConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan
@Import({RestaurantViewBackendConfig.class, EventuateDriverConfiguration.class})
public class ReceiverApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReceiverApplication.class, args);
    }
}
