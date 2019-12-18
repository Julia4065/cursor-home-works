package hw05.list;

import hw05.comparators.MyCustomComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyNumberList<T extends Number> {
    private List<T> arrayList = new ArrayList<>();

    public boolean add(T element) {
        arrayList.add(element);
        return true;
    }

    public T findMinElement() {
        return (T) Collections.min(arrayList, new MyCustomComparator());
    }

    public T findMaxElement() {
        return (T) Collections.max(arrayList, new MyCustomComparator());
    }
}
