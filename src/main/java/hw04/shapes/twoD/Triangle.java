package hw04.shapes.twoD;

import hw04.shapes.Vertex;

import static hw04.shapes.Vertex.distanceBetweenVertices;
import static java.lang.Math.sqrt;
import static org.apache.commons.math3.util.Precision.round;

public class Triangle extends PlaneShape {

    double sideA;
    double sideB;
    double sideC;

    public Triangle(Vertex vertexA, Vertex vertexB, Vertex vertexC) {
        super(vertexA, vertexB, vertexC);
        this.sideA = distanceBetweenVertices(vertexA, vertexB);
        this.sideB = distanceBetweenVertices(vertexB, vertexC);
        this.sideC = distanceBetweenVertices(vertexC, vertexA);
    }

    @Override
    public double getArea() {
        double halfPerimeter = (sideA + sideB + sideC) / 2;
        return round(sqrt(halfPerimeter * (halfPerimeter - sideA) * (halfPerimeter - sideB) * (halfPerimeter - sideC)), 2);
    }

    @Override
    public double getPerimeter() {
        return round(sideA + sideB + sideC, 2);
    }

    @Override
    public String toString() {
        return "Shape type is " + this.getClass().getSimpleName() + "\n" +
                "Vertex coordinates: " + vertexA.getX() + ", " + vertexA.getY() + "\n" +
                "Vertex coordinates: " + vertexB.getX() + ", " + vertexB.getY() + "\n" +
                "Vertex coordinates: " + vertexC.getX() + ", " + vertexC.getY() + "\n" +
                "Area is " + getArea() + "\n" +
                "Perimeter is " + getPerimeter();
    }
}
