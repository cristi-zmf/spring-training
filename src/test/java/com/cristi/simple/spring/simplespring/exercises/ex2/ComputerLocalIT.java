package com.cristi.simple.spring.simplespring.exercises.ex2;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
@SpringBootTest
class ComputerLocalIT {
    @Autowired
    private Computer smartComputer;

    @Test
    void sum() {
        assertThat(smartComputer)
                .withFailMessage("You forgot to implement this interface: %s", Computer.class)
                .isNotNull();
        int result = smartComputer.sum(2, 2);
        assertThat(result).isEqualTo(4);
    }
}
