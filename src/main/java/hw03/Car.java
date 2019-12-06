package hw03;

public class Car {

    boolean isEngineStarted;
    int speed;
    boolean isCarMoving;

    private void startEngine() {
        isEngineStarted = true;
        System.out.println("Engine is started");
    }

    private void stopEngine() {
        isEngineStarted = false;
        System.out.println("Engine is stopped");
    }

    private void move(){
        if (isEngineStarted) {
            isCarMoving = true;
        }
    }

    private void setSpeed(int requiredSpeed){
        speed = requiredSpeed;
    }









}
