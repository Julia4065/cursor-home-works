package hw10.models.impl;

import hw10.models.Sedan;

public class ToyotaSedan implements Sedan {
    public ToyotaSedan() {
        System.out.println("ToyotaSedan is created");
    }

    @Override
    public void drive() {
        System.out.println("I am driving ToyotaSedan");
    }
}
