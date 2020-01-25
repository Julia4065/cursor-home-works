package hw10.factories.impl;

import hw10.factories.CarFactory;
import hw10.models.Coupe;
import hw10.models.Sedan;
import hw10.models.impl.ToyotaCoupe;
import hw10.models.impl.ToyotaSedan;

public class ToyotaFactory implements CarFactory {
    @Override
    public Sedan createSedan() {
        return new ToyotaSedan();
    }

    @Override
    public Coupe createCoupe() {
        return new ToyotaCoupe();
    }
}
