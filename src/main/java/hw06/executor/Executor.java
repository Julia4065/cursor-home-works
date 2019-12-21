package hw06.executor;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static hw06.listmanipulator.ListManipulator.*;

public class Executor {
    private static List<String> fruits = new ArrayList<>();
    private static List<String> fruitsAndVegetables = new ArrayList<>();

    public static void demonstrateManipulationsWithList() {
        demonstrateRemovingElementsFromList();
        demonstrateReplacementValueInList();
        demonstrateExistenceOfSharedElement();
        demonstrateDescOrderingForTreeSet();
    }

    public static void demonstrateRemovingElementsFromList() {
        int divisibleNumber = 3;
        List<Integer> listOfIntegers = new ArrayList<>();
        listOfIntegers.add(3);
        listOfIntegers.add(9);
        listOfIntegers.add(11);
        listOfIntegers.add(18);
        listOfIntegers.add(20);
        listOfIntegers.add(22);

        System.out.println("List before removing: " + listOfIntegers);
        removeElementsThatDivisibleBy(listOfIntegers, divisibleNumber);
        System.out.println("List after removing elements that are divisible by " + divisibleNumber + " :" + listOfIntegers);
    }

    public static void demonstrateReplacementValueInList() {
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Kiwi");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Mandarin");

        System.out.println("List before replacement: " + fruits);
        replaceValueInList(fruits, "Orange", "Grapefruit");
        System.out.println("List after replacement: " + fruits);
    }

    public static void demonstrateExistenceOfSharedElement() {
        fruitsAndVegetables.add("Tomato");
        fruitsAndVegetables.add("Cucumber");
        fruitsAndVegetables.add("Potato");
        fruitsAndVegetables.add("Carrot");
        fruitsAndVegetables.add("Apple");
        System.out.println("First list : " + fruits);
        System.out.println("Second list: " + fruitsAndVegetables);
        System.out.println(isSharedElementExists(fruits, fruitsAndVegetables) ? "No similar elements found in lists" : "Lists have at list one similar element");
    }

    @SuppressWarnings("unchecked")
    public static void demonstrateDescOrderingForTreeSet() {
        Set treeSet = descOrderingForTreeSet();
        treeSet.add("E");
        treeSet.add("C");
        treeSet.add("B");
        treeSet.add("D");
        treeSet.add("A");
        treeSet.add("K");

        System.out.println("Tree set in DESC ordering: " + treeSet);
    }
}
