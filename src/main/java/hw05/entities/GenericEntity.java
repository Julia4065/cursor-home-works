package hw05.entities;

import java.util.Arrays;
import java.util.Collections;

public class GenericEntity<T extends Comparable> {

    private T[] arr;

    public GenericEntity(T[] arr) {
        this.arr = arr;
    }

    public T findMaxValue() {
        return (T) Collections.max(Arrays.asList(arr));
    }

    public T findMinValue() {
        return (T) Collections.min(Arrays.asList(arr));
    }
}