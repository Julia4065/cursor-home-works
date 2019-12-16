package hw04.shapes.threeD;

import hw04.shapes.Vertex;

import static java.lang.Math.PI;
import static java.lang.Math.pow;
import static org.apache.commons.math3.util.Precision.round;

public class Sphere extends SpaceShape {

    double radius;

    public Sphere(Vertex vertex, double radius) {
        super(vertex);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return round(4 * PI * pow(radius, 2), 2);
    }

    @Override
    public double getVolume() {
        return round((4.0 / 3.0) * PI * pow(radius, 3), 2);
    }

    @Override
    public String toString() {
        return "Shape type is " + this.getClass().getSimpleName() + "\n" +
                "Vertex coordinates: " + vertexA.getX() + ", " + vertexA.getY() + "\n" +
                "Radius is " + radius + "\n" +
                "Area is " + getArea() + "\n" +
                "Volume is " + getVolume();
    }
}
