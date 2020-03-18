package com.cristi.simple.spring.simplespring.liskov;

import lombok.Getter;
import lombok.ToString;

import java.util.HashSet;
import java.util.Set;
@ToString
@Getter
public class Manager {
    private String name;
    protected Set<Subordinate> subordinates;

    public Manager(String name) {
        this.name = name;
        subordinates = new HashSet<>();
    }

    public void addSubordinate(Subordinate subordinate) {
        subordinates.add(subordinate);
    }
}
