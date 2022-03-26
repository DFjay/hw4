package com.example.hw4;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(CarConfigProperties.class)
public class CarConfiguration {
    public CarConfigProperties carConfigProperties;

    public CarConfiguration(CarConfigProperties carConfigProperties) {
        this.carConfigProperties = carConfigProperties;
    }
}
