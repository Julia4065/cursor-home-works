package hw10.models.impl;

import hw10.models.Coupe;

public class FordCoupe implements Coupe {
    public FordCoupe() {
        System.out.println("FordCoupe is created");
    }

    @Override
    public void drive() {
        System.out.println("I am driving FordCoupe");
    }
}
