package hw10.executor;

import hw10.factories.CarFactory;
import hw10.factories.impl.FordFactory;
import hw10.factories.impl.ToyotaFactory;

public class Executor {

    private CarFactory carFactory;

    public void createCars() {
        createToyotaSedanCar();
        createFordCoupeCar();
    }

    private void createToyotaSedanCar() {
        carFactory = new ToyotaFactory();
        carFactory.createSedan().drive();

    }

    private void createFordCoupeCar() {
        carFactory = new FordFactory();
        carFactory.createCoupe().drive();
    }
}
