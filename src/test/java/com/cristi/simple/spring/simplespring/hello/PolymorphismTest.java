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
    @Test
    void dog_should_have_a_dog_cry() {
        Animal aDog = new Dog();
        System.out.println(aDog.cry());
        assertThat(aDog.cry()).isEqualTo("Ham ham");
    }

    /*Implement these method so that the test above passes*/
    public static Animal aCow() {
        return new Cow();
    }
}