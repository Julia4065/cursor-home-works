package hw04.shapes.twoD;

import hw04.shapes.Vertex;

import static org.apache.commons.math3.util.Precision.round;

public class Rectangle extends PlaneShape {

    double width;
    double height;

    public Rectangle(Vertex vertex, double width, double height) {
        super(vertex);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return round(width * height, 2);
    }

    @Override
    public double getPerimeter() {
        return round(2 * (width + height), 2);
    }

    @Override
    public String toString() {
        return "Shape type is " + this.getClass().getSimpleName() + "\n" +
                "Vertex coordinates: " + vertexA.getX() + ", " + vertexA.getY() + "\n" +
                "Width is " + width + "\n" +
                "Height is " + height + "\n" +
                "Area is " + getArea() + "\n" +
                "Perimeter is " + getPerimeter();
    }
}
