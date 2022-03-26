package com.example.hw4;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnBean(Engine.class)
public class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public String sound() {
        return "wrr";
    }
}
