package com.example.hw4;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("test")
public class Engine {
    private CarConfigProperties carConfigProperties;

    public Engine(CarConfigProperties carConfigProperties) {
        this.carConfigProperties = carConfigProperties;
    }

    public String info() {
        return carConfigProperties.getEngine();
    }
}
