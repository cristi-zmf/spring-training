package com.cristi.simple.spring.simplespring.beancycle;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service // Spring bean
public class Dice {

    @PostConstruct
    public void rollTheDice() {
        int randomNumber = (int) (7 * Math.random());
        System.out.println("Rolling the dice: " + randomNumber);
    }
}
