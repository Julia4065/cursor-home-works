package hw04.shapes;

import hw04.models.ShapeVertex;

public abstract class Shape {

    protected ShapeVertex vertexA;
    protected ShapeVertex vertexB;
    protected ShapeVertex vertexC;

    protected Shape(ShapeVertex vertexA) {
        this(vertexA, null, null);
    }

    protected Shape(ShapeVertex vertexA, ShapeVertex vertexB, ShapeVertex vertexC) {
        this.vertexA = vertexA;
        this.vertexB = vertexB;
        this.vertexC = vertexC;
    }
}
