package com.cristi.simple.spring.simplespring.exercises.ex4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/*
* Help these bunny shed some weight off before spring ends (spring context is closed)
*
* Make use of bean lifecycle methods to make the bunny loose some weight at the end
* of spring context
*
* Hint, something that Thanos would do...
*
* By the end of the spring he should weigh 10 kilograms
*
* Use com.cristi.simple.spring.simplespring.exercises.ex4.WeightInKilograms.dropWeight
* method to make the bunny loose weight
* */

@Component
public class FatBunny {
    private WeightInKilograms weight;

    @Autowired
    public FatBunny(WeightInKilograms weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight.getWeight();
    }

    @PostConstruct
    public void doSomethingAfterBeanInstantiation() {
        System.out.println("Doing something at the end of bean creation lifecycle");
    }

    @PreDestroy
    public void doSomethingBeforeShuttingDown() {
        weight.dropWeight(10);
    }
}
