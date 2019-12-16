package hw04.shapes.twoD;

import hw04.measures.AreaMeasurable;
import hw04.measures.PerimeterMeasurable;
import hw04.models.ShapeVertex;
import hw04.shapes.Shape;

abstract class PlaneShape extends Shape implements AreaMeasurable, PerimeterMeasurable {

    protected PlaneShape(ShapeVertex vertex) {
        super(vertex);
    }

    protected PlaneShape(ShapeVertex vertexA, ShapeVertex vertexB, ShapeVertex vertexC) {
        super(vertexA, vertexB, vertexC);
    }
}
