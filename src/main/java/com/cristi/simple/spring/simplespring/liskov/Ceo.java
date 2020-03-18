package com.cristi.simple.spring.simplespring.liskov;

import java.util.TreeSet;

public class Ceo extends Manager {
    public Ceo(String name) {
        super(name);
        subordinates = new TreeSet<>();
    }

    public static void main(String[] args) {
        Manager manager1 = new Manager("John");
        Manager ceo = new Ceo("Big Boss");

        manager1.addSubordinate(new Subordinate());
        System.out.println("So far so good");
        ceo.addSubordinate(new Subordinate());
    }
}
