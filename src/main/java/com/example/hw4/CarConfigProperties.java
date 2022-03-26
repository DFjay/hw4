package com.example.hw4;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties(prefix = "car")
public class CarConfigProperties {
    String models;
    String engine;
    String power;
}
