package hw04.shapes.threeD;

import hw04.shapes.AreaMeasurable;
import hw04.shapes.Shape;
import hw04.shapes.Vertex;
import hw04.shapes.VolumeMeasurable;

public abstract class SpaceShape extends Shape implements AreaMeasurable, VolumeMeasurable {
    public SpaceShape(Vertex vertex) {
        super(vertex);
    }
}
