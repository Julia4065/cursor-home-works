package hw08.box;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BoxWrapper {

    public static void packFragileThings(List<Box> box) {

        Stream<Thing> fragileThings = box.stream()
                .flatMap(thing -> thing.getThing().stream())
                .filter(Thing::isFragile);

        List<Protector> wrappedFragileThings = fragileThings
                .map(fragileThing -> new Protector(fragileThing.getNameOfThing()))
                .collect(Collectors.toList());

        System.out.println("List of fragile things that got extra packing: ");
        System.out.println(wrappedFragileThings);
    }
}
