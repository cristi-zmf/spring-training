package com.cristi.simple.spring.simplespring.hello;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PolymorphismTest {

    @Test
    void cow_should_have_a_moo_cry() {
        Animal aCow = aCow();
        assertThat(aCow.cry()).isEqualTo("moo");
    }

    /*Implement these method so that the test above passes*/
    public static Animal aCow() {
        return null;
    }
}