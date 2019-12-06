package hw03;

public class Car {

    boolean isEngineStarted;
    int speed;
    boolean isCarMoving;

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
        }
    }

    void setSpeed(int requiredSpeed) {
        speed = requiredSpeed;
    }
}
