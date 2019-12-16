package hw04.shapes.twoD;

import hw04.shapes.Vertex;

import static java.lang.Math.PI;
import static java.lang.Math.pow;
import static org.apache.commons.math3.util.Precision.round;

public class Circle extends PlaneShape {

    double radius;

    public Circle(Vertex vertex, double radius) {
        super(vertex);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return round(PI * pow(radius, 2), 2);
    }

    @Override
    public double getPerimeter() {
        return round(2 * PI * radius, 2);
    }

    @Override
    public String toString() {
        return "Shape type is " + this.getClass().getSimpleName() + "\n" +
                "Vertex coordinates: " + vertexA.getX() + ", " + vertexA.getY() + "\n" +
                "Radius is " + radius + "\n" +
                "Area is " + getArea() + "\n" +
                "Perimeter is " + getPerimeter();
    }
}
