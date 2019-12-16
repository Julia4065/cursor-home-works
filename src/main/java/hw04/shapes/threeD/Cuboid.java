package hw04.shapes.threeD;

import hw04.shapes.Vertex;

import static org.apache.commons.math3.util.Precision.round;

public class Cuboid extends SpaceShape {

    double width;
    double height;
    double length;

    public Cuboid(Vertex vertex, double width, double height, double lenght) {
        super(vertex);
        this.width = width;
        this.height = height;
        this.length = lenght;
    }

    @Override
    public double getArea() {
        return round(2 * areaOfTheBaseOrTop() + 2 * areaOfTheRightOrLeftSide() + 2 * areaOfTheBackOrFront(), 2);
    }

    @Override
    public double getVolume() {
        return width * length * height;
    }

    @Override
    public String toString() {
        return "Shape type is " + this.getClass().getSimpleName() + "\n" +
                "Vertex coordinates: " + vertexA.getX() + ", " + vertexA.getY() + "\n" +
                "Width is " + width + "\n" +
                "Height is " + height + "\n" +
                "Length is " + length + "\n" +
                "Area is " + getArea() + "\n" +
                "Volume is " + getVolume();
    }

    private double areaOfTheBaseOrTop() {
        return width * length;
    }

    private double areaOfTheBackOrFront() {
        return length * height;
    }

    private double areaOfTheRightOrLeftSide() {
        return width * height;
    }
}
