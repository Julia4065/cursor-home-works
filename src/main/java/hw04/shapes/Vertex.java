package hw04.shapes;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Vertex {

    double x;
    double y;

    public Vertex(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static double distanceBetweenVertices(Vertex vertexA, Vertex vertexB) {
        return sqrt(pow((vertexA.getX() - vertexB.getX()), 2) + pow((vertexA.getY() - vertexB.getY()), 2));
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
