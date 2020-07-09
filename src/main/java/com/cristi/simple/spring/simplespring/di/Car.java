package com.cristi.simple.spring.simplespring.di;

import org.springframework.stereotype.Service;

@Service
public class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.run();
    }

}
