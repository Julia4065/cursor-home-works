package hw08.box;

import java.util.List;

public class Box {

    private List<Thing> things;

    public Box(List<Thing> things) {
        this.things = things;
    }

    public List<Thing> getThing() {
        return things;
    }

    @Override
    public String toString() {
        return "Box{" +
                "things=" + things +
                '}';
    }
}
