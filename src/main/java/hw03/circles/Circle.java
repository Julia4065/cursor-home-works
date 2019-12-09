package hw03.circles;

import org.apache.commons.math3.util.Precision;

public class Circle {

    public static int circlesNumber;

    private double radius;

    private Circle(double radius) {
        circlesNumber++;
        this.radius = radius;
    }

    public static Circle createCircle(double radius) {
        return new Circle(radius);
    }

    public double area() {
        return Precision.round(Math.pow(radius, 2) * Math.PI, 3);
    }

    public double getRadius() {
        return radius;
    }
}
