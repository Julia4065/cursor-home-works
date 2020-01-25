package hw10.factories.impl;

import hw10.factories.CarFactory;
import hw10.models.Coupe;
import hw10.models.Sedan;
import hw10.models.impl.FordCoupe;
import hw10.models.impl.FordSedan;

public class FordFactory implements CarFactory {
    @Override
    public Sedan createSedan() {
        return new FordSedan();
    }

    @Override
    public Coupe createCoupe() {
        return new FordCoupe();
    }
}
