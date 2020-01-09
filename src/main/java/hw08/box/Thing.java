package hw08.box;

public class Thing {

    private String nameOfThing;
    private boolean isFragile;

    public Thing(String nameOfThing, boolean isFragile) {
        this.nameOfThing = nameOfThing;
        this.isFragile = isFragile;
    }

    @Override
    public String toString() {
        return "Thing{" +
                "nameOfThing='" + nameOfThing + '\'' +
                ", isFragile=" + isFragile +
                '}';
    }

    public boolean isFragile() {
        return isFragile;
    }

    public String getNameOfThing() {
        return nameOfThing;
    }
}
