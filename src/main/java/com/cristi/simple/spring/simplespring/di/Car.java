package com.cristi.simple.spring.simplespring.di;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

@Service
public class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }
    @PostConstruct
    public void start() {
        Consumer<String> additionalLogic = s -> {
            engine.run();
            System.out.println(s);
        };
        additionalLogic.accept("ciuciu");
    }

    public static void main(String[] args) {
        List<StringBuilder> strings = new ArrayList<>();
        StringBuilder mutableString = new StringBuilder("ceva");
        strings.add(mutableString);
        ArrayList<StringBuilder> strings2 = new ArrayList<>(strings);
        System.out.println(strings);
        System.out.println(strings2);
        System.out.println("Modifying mutable string...");
        mutableString.append(" inca ceva");
        System.out.println(strings);
        System.out.println(strings2);
    }
}
