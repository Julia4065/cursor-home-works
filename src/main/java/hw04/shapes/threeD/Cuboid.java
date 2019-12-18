package hw04.shapes.threeD;

import hw04.models.ShapeVertex;

import static org.apache.commons.math3.util.Precision.round;

public class Cuboid extends SpaceShape {

    private double width;
    private double height;
    private double length;

    public Cuboid(ShapeVertex vertex, double width, double height, double lenght) {
        super(vertex);
        this.width = width;
        this.height = height;
        this.length = lenght;
    }

    @Override
    public double getArea() {
        return round(2 * (areaOfTheBaseOrTop() + areaOfTheRightOrLeftSide() + areaOfTheBackOrFront()), 2);
    }

    @Override
    public double getVolume() {
        return width * length * height;
    }

    @Override
    public String toString() {
        return "Shape type is " + this.getClass().getSimpleName() + "\n" +
                "ShapeVertex coordinates: " + vertexA.getX() + ", " + vertexA.getY() + "\n" +
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
