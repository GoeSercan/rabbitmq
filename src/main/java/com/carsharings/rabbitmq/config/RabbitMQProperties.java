package com.carsharings.rabbitmq.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "spring.rabbitmq")
@Getter
@Setter
public class RabbitMQProperties {
    private String host;
    private int port;
    private String username;
    private String password;
}

