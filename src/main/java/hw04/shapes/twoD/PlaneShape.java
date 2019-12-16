package hw04.shapes.twoD;

import hw04.shapes.AreaMeasurable;
import hw04.shapes.PerimeterMeasurable;
import hw04.shapes.Shape;
import hw04.shapes.Vertex;

public abstract class PlaneShape extends Shape implements AreaMeasurable, PerimeterMeasurable {

    public PlaneShape(Vertex vertex) {
        super(vertex);
    }

    public PlaneShape(Vertex vertexA, Vertex vertexB, Vertex vertexC) {
        super(vertexA, vertexB, vertexC);
    }
}
