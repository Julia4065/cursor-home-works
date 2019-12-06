package hw03.circles;

import org.apache.commons.math3.util.Precision;

public class Circle {

    public static int circleCounter;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        circleCounter++;
    }

    public double area() {
        return Precision.round(Math.pow(radius, 2) * Math.PI, 3);
    }
}
