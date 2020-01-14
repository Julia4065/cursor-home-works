package hw10.models.impl;

import hw10.models.Sedan;

public class FordSedan implements Sedan {
    public FordSedan() {
        System.out.println("FordSedan is created");
    }

    @Override
    public void drive() {
        System.out.println("I am driving FordSedan");

    }
}
