package hw10.models.impl;

import hw10.models.Coupe;

public class ToyotaCoupe implements Coupe {
    public ToyotaCoupe() {
        System.out.println("ToyotaCoupe is created");
    }

    @Override
    public void drive() {
        System.out.println("I am driving ToyotaCoupe");
    }
}
