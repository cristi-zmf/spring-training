package com.cristi.simple.spring.simplespring.di;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class HydrogenEngine implements Engine {

    @Override
    public void run() {
        System.out.println("Running on hydrogen");
    }
}
