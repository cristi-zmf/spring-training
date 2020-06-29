package com.cristi.simple.spring.simplespring.hello;
import lombok.SneakyThrows;

public class Car {
    private int fuelLitersLeft;
    private String engineStatus;

    public Car() {
        fuelLitersLeft = 40;
        engineStatus = "good";
    }

    @SneakyThrows
    public void drive()  {
        while (fuelLitersLeft > 0) {
            fuelLitersLeft--;
            System.out.println("Driving...");
            Thread.sleep(1000);
        }
        System.out.println("Out of fuel, stopping...");
    }
}
