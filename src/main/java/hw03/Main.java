package hw03;

import hw03.circles.Circle;

public class Main {

    public static void main(String[] args) {
        Circle firstCircle = Circle.createCircle(5);
        System.out.println("Area of circle with radius " + firstCircle.getRadius() + " is = " + firstCircle.area());
        Circle.createCircle(2);

        System.out.println("How many circles were initiated = " + Circle.circlesNumber);
    }
}
