package hw04.shapes.threeD;

import hw04.models.ShapeVertex;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static org.apache.commons.math3.util.Precision.round;

public class SquarePyramid extends SpaceShape {

    private double baseWidth;
    private double height;

    public SquarePyramid(ShapeVertex vertex, double baseWidth, double height) {
        super(vertex);
        this.baseWidth = baseWidth;
        this.height = height;
    }

    @Override
    public double getArea() {
        return round(2 * baseWidth * (baseWidth / (2 + sqrt(pow(height, 2) + pow(baseWidth / 2, 2)))), 2);
    }

    @Override
    public double getVolume() {
        return round((1.0 / 3.0) * pow(baseWidth, 2) * height, 2);
    }

    @Override
    public String toString() {
        return "Shape type is " + this.getClass().getSimpleName() + "\n" +
                "ShapeVertex coordinates: " + vertexA.getX() + ", " + vertexA.getY() + "\n" +
                "Base width is " + baseWidth + "\n" +
                "Height is " + height + "\n" +
                "Area is " + getArea() + "\n" +
                "Volume is " + getVolume();
    }
}
