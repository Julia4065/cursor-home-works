package hw04.models;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class ShapeVertex {

    private double x;
    private double y;

    public ShapeVertex(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static double distanceBetweenVertices(ShapeVertex shapeVertexA, ShapeVertex shapeVertexB) {
        return sqrt(pow((shapeVertexA.getX() - shapeVertexB.getX()), 2) + pow((shapeVertexA.getY() - shapeVertexB.getY()), 2));
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
