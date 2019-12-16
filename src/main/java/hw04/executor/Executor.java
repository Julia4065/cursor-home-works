package hw04.executor;

import hw04.models.ShapeVertex;
import hw04.shapes.Shape;
import hw04.shapes.threeD.Cuboid;
import hw04.shapes.threeD.Sphere;
import hw04.shapes.threeD.SquarePyramid;
import hw04.shapes.twoD.Circle;
import hw04.shapes.twoD.Rectangle;
import hw04.shapes.twoD.Triangle;

import java.util.ArrayList;
import java.util.List;

public class Executor {
    public void demonstrateShapes() {
        ShapeVertex vertex = new ShapeVertex(5, 6);
        Circle circle = new Circle(vertex, 5);
        Rectangle rectangle = new Rectangle(vertex, 7, 2);
        Triangle triangle = new Triangle(vertex, new ShapeVertex(2, 5), new ShapeVertex(3, 8));
        Cuboid cuboid = new Cuboid(vertex, 8, 7, 5);
        Sphere sphere = new Sphere(vertex, 5);
        SquarePyramid pyramid = new SquarePyramid(vertex, 10, 3);

        List<Shape> shapes = new ArrayList<>();
        shapes.add(circle);
        shapes.add(rectangle);
        shapes.add(triangle);
        shapes.add(cuboid);
        shapes.add(sphere);
        shapes.add(pyramid);

        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println();
        }
    }
}
