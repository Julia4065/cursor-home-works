package hw04.shapes.threeD;

import hw04.measures.AreaMeasurable;
import hw04.measures.VolumeMeasurable;
import hw04.models.ShapeVertex;
import hw04.shapes.Shape;

public abstract class SpaceShape extends Shape implements AreaMeasurable, VolumeMeasurable {
    protected SpaceShape(ShapeVertex vertex) {
        super(vertex);
    }
}
