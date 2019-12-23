package hw08.box;

public class Protector {

    private String nameOfThing;

    public Protector(String nameOfThing) {
        this.nameOfThing = nameOfThing;
    }

    @Override
    public String toString() {
        return "nameOfThing='" + nameOfThing;
    }
}
