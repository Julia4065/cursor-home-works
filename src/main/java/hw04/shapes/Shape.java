package hw04.shapes;

public abstract class Shape {

    public Vertex vertexA;
    public Vertex vertexB;
    public Vertex vertexC;

    public Shape(Vertex vertexA) {
        this(vertexA,null, null);
    }

    public Shape(Vertex vertexA, Vertex vertexB, Vertex vertexC) {
        this.vertexA = vertexA;
        this.vertexB = vertexB;
        this.vertexC = vertexC;
    }
}
