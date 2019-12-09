package hw03;

public class Car {

    private boolean isEngineStarted;
    private int speed;
    private boolean isCarMoving;

    void startEngine() {
        isEngineStarted = true;
        System.out.println("Engine is started");
    }

    void stopEngine() {
        isEngineStarted = false;
        System.out.println("Engine is stopped");
    }

    void move() {
        if (isEngineStarted) {
            isCarMoving = true;
            System.out.println("Car is moving");
        } else {
            System.out.println("Car can't move as engine is not started!");
        }
    }

    void setSpeed(int requiredSpeed) {
        speed = requiredSpeed;
        System.out.println("Car is moving with speed " + requiredSpeed);
    }
}
