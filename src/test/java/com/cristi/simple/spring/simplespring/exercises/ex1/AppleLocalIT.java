package com.cristi.simple.spring.simplespring.exercises.ex1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class AppleLocalIT {
    @Autowired(required = false)
    private Apple freshApple;

    @Test
    void spring_should_give_us_an_apple() {
        assertThat(freshApple)
                .withFailMessage(whyNoAppleErrorMessage())
                .isNotNull();
    }

    private String whyNoAppleErrorMessage() {
        return "Why you no give me fresh apple spring? Did you forget to *adnotate* something?";
    }
}
