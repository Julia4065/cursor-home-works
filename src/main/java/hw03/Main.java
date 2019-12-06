package hw03;

import hw03.circles.Circle;

public class Main {

    public static void main(String[] args) {
        System.out.println(new Circle(5).area());
        System.out.println(new Circle(7).area());
        System.out.println("How many circles were initiated = " + Circle.circleCounter);

    }
}
