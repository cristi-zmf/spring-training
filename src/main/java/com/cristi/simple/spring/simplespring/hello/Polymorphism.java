package com.cristi.simple.spring.simplespring.hello;

public class Polymorphism {
    public static void main(String[] args) {
        Animal aDog = new Dog();
        Animal aCat = new Cat();
        System.out.println("My cry as a dog:" + aDog.cry());
        System.out.println("My cry as a cat:" + aCat.cry());

        Dog actualDog = (Dog) aDog;
        Cat actualCat = (Cat) aCat;

        System.out.println("My cry as an actual dog:" + actualDog.cry());
        System.out.println("My cry as an actual cat:" + actualCat.cry());
    }
}
