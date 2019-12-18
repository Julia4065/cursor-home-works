package hw05.comparators;

import java.util.Comparator;

public class MyCustomComparator<T extends Comparable<T>> implements Comparator<T> {
    @Override
    public int compare(T a, T b) {
        return a.compareTo(b);
    }
}
