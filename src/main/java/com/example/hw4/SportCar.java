package com.example.hw4;

import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnExpression(
        "not '${car.power}'.equals('default')"
)
public class SportCar {
    private CarConfigProperties carConfigProperties;


    public SportCar(CarConfigProperties carConfigProperties) {
        this.carConfigProperties = carConfigProperties;
    }

    public String sound() {
        return carConfigProperties.getPower() + ": WRRRRR";
    }
}
