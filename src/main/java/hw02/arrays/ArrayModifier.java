package hw02.arrays;

import java.util.Arrays;
import java.util.Collections;

public class ArrayModifier {

    void sortArrayDesc(int[] originArray) {
        printPrimitiveArray("Array before sorting: ", originArray);

        Integer[] convertedArray = Arrays.stream(originArray).boxed().toArray(Integer[]::new);
        Arrays.sort(convertedArray, Collections.reverseOrder());
        originArray = Arrays.stream(convertedArray).mapToInt(Integer::intValue).toArray();

        printPrimitiveArray("Array after descending sorting: ", originArray);
    }

    double findAverageSumOfListNumbersOf(int[] originalArray) {
        printPrimitiveArray("Original array: ", originalArray);
        int sumOfListElements = Arrays.stream(originalArray).sum();

        return (originalArray.length == 0) ? 0 : (double) sumOfListElements / originalArray.length;
    }

    int getTheSumOfPositiveElements(int[] array) {
        printPrimitiveArray("Original array: ", array);
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                sum += array[i];
            }
        }
        return sum;
    }

    void replaceDuplicateElementsWithZero(int[] arrayWithDuplicates) {
        printPrimitiveArray("Origin array: ", arrayWithDuplicates);

        for (int i = 0; i < arrayWithDuplicates.length; i++) {
            int elForComparison = arrayWithDuplicates[i];
            for (int j = i + 1; j < arrayWithDuplicates.length; j++) {
                if (arrayWithDuplicates[j] == elForComparison) {
                    arrayWithDuplicates[j] = 0;
                }
            }
        }
        printPrimitiveArray("Array after all duplicates were replaced with zero: ", arrayWithDuplicates);
    }

    private void printPrimitiveArray(String message, int[] arrayToPrint) {
        System.out.print(message);
        Arrays.stream(arrayToPrint).forEach(n -> System.out.print(n + " "));
        System.out.print("\n");
    }
}