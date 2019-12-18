package hw05.executors;

import hw05.entities.GenericEntity;
import hw05.list.MyComparableList;
import hw05.list.MyNumberList;

public class Executor {
    public static void demonstrateGenericsWithNumberElements() {
        System.out.println("\n" + "Number list demonstration");
        MyNumberList<Float> listOfFloatElements = new MyNumberList<>();
        listOfFloatElements.add(6.7f);
        listOfFloatElements.add(6.8f);
        listOfFloatElements.add(7f);
        listOfFloatElements.add(2.77f);

        System.out.println("Min element from the listOfFloatElements is " + listOfFloatElements.findMinElement());
        System.out.println("Max element from the listOfFloatElements is " + listOfFloatElements.findMaxElement());

        MyNumberList<Integer> listOfIntegerElements = new MyNumberList<>();
        listOfIntegerElements.add(4);
        listOfIntegerElements.add(5);
        listOfIntegerElements.add(76);
        listOfIntegerElements.add(96);

        System.out.println("Min element from the listOfIntegerElements is " + listOfIntegerElements.findMinElement());
        System.out.println("Max element from the listOfIntegerElements is " + listOfIntegerElements.findMaxElement());
    }

    public static void demonstrateGenericsWithComparableElements() {
        System.out.println("\n" + "Comparable lists demonstration");
        MyComparableList<Float> floatList = new MyComparableList<>();
        floatList.add(6.7f);
        floatList.add(6.8f);
        floatList.add(7f);
        floatList.add(2.77f);

        System.out.println("Min element from the float list is " + floatList.findMinElement());
        System.out.println("Max element from the float list is " + floatList.findMaxElement());

        MyComparableList<String> listOfStrings = new MyComparableList<>();
        listOfStrings.add("A");
        listOfStrings.add("Z");
        listOfStrings.add("B");
        listOfStrings.add("F");

        System.out.println("Min element from the string list is " + listOfStrings.findMinElement());
        System.out.println("Max element from the string list is " + listOfStrings.findMaxElement());
    }

    public static void demonstrateGenericEntity() {
        System.out.println("\n" + "Generic class demonstration:");
        String[] arrayOfStrings = {"A", "B", "Z", "K"};

        GenericEntity<String> genericEntityOfStrings = new GenericEntity<>(arrayOfStrings);
        System.out.println("Max value from the array is " + genericEntityOfStrings.findMaxValue());
        System.out.println("Min value from the array is " + genericEntityOfStrings.findMinValue());

        Integer[] arrayOfIntegers = {1, 4, 6, 7};

        GenericEntity<Integer> genericEntityOfIntegers = new GenericEntity<>(arrayOfIntegers);
        System.out.println("Max value from the array is " + genericEntityOfIntegers.findMaxValue());
        System.out.println("Min value from the array is " + genericEntityOfIntegers.findMinValue());
    }
}
