package hw06.listmanipulator;

import java.util.*;

public class ListManipulator {

    public static void removeElementsThatDivisibleBy(List<Integer> list, int divisibleNumber) {
        list.removeIf(n -> n % divisibleNumber == 0);
    }

    public static void replaceValueInList(List<String> list, String oldValue, String newValue) {
        Collections.replaceAll(list, oldValue, newValue);
        if (!list.contains(newValue)) {
            System.out.println("Value is not present in list so no replacement happens in the list");
        }
    }

    public static boolean isSharedElementExists(List<String> firstList, List<String> secondList) {
        return Collections.disjoint(firstList, secondList);
    }

    @SuppressWarnings("unchecked")
    public static Set descOrderingForTreeSet() {
        Set<String> treeSet = new TreeSet(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        return treeSet;
    }
}
