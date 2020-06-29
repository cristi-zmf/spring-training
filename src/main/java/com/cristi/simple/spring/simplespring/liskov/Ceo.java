package com.cristi.simple.spring.simplespring.liskov;

import java.util.TreeSet;

public class Ceo extends Manager {
    public Ceo(String name) {
        super(name);
        subordinates = new TreeSet<>(); //liskov broken
    }

    public static void main(String[] args) {
        Manager manager1 = new Manager("John");
        Manager ceo = new Ceo("Big Boss"); //clasa copil

        manager1.addSubordinate(new Subordinate());
        System.out.println("So far so good");
        Manager partner = new ManagingPartner("Partner");

        ceo.addSubordinate(new Subordinate());
        System.out.println("Ajungem aici?");

    }
}
