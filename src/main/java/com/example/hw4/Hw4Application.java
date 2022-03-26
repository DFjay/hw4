package com.example.hw4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Hw4Application {
    private static Car car;
    private static SportCar sportCar;
    private static Engine engine;


    public Hw4Application(Car car, SportCar sportCar, Engine engine) {
        Hw4Application.car = car;
        Hw4Application.sportCar = sportCar;
        Hw4Application.engine = engine;
    }

    public static void main(String[] args) {
        SpringApplication.run(Hw4Application.class, args);
        System.out.println(car.sound());
        System.out.println(sportCar.sound());
        System.out.println(engine.info());
    }

}
