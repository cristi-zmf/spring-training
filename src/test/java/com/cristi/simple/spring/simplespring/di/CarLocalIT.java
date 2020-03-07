package com.cristi.simple.spring.simplespring.di;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CarLocalIT {
    @Autowired
    private Car myBeautifulCar;

    @Test
    void spring_should_build_my_car_without_me_doing_anything() {
        myBeautifulCar.start();
    }
}
