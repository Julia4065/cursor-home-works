package hw04.shapes;

import hw04.shapes.threeD.Cuboid;
import hw04.shapes.threeD.Sphere;
import hw04.shapes.threeD.SquarePyramid;
import hw04.shapes.twoD.Circle;
import hw04.shapes.twoD.Rectangle;
import hw04.shapes.twoD.Triangle;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        demonstrateShapes();
    }

    private static void demonstrateShapes() {
        Circle circle = new Circle(new Vertex(5, 6), 5);
        Rectangle rectangle = new Rectangle(new Vertex(5, 4), 7, 2);
        Triangle triangle = new Triangle(new Vertex(7, 3), new Vertex(2, 5), new Vertex(3, 8));
        Cuboid cuboid = new Cuboid(new Vertex(5, 7), 8, 7, 5);
        Sphere sphere = new Sphere(new Vertex(5, 7), 5);
        SquarePyramid pyramid = new SquarePyramid(new Vertex(5, 7), 10, 3);

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
