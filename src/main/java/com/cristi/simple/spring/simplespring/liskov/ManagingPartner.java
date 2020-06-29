package com.cristi.simple.spring.simplespring.liskov;

public class ManagingPartner extends Manager {

    public ManagingPartner(String name) {
        super(name);
        throw new IllegalStateException("I am evil");
    }
}
