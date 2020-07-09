package com.cristi.simple.spring.simplespring.di;

import org.springframework.stereotype.Component;

@Component //Spring Bean, manageuit de spring
public class DieselEngine implements Engine {

    @Override
    public void run() {
        System.out.println("Runs on diesel... pfew! I smell pollution!!!");
    }
}
