package hw02.arrays;

import java.util.Arrays;
import java.util.Collections;

public class ArrayModifier {
    //ArrayHandler

    public void sortArrayDesc(Integer[] originArray) {
        printArrayOfReferences("Array before sorting: ", originArray);
        Arrays.sort(originArray, Collections.reverseOrder());
        printArrayOfReferences("Array after descending sorting: ", originArray);
    }

    public double averageListNumbersOf(int[] originalArray) {
        printPrimitiveArray("Original array: ", originalArray);
        int sumOfListElements = Arrays.stream(originalArray).sum();

        return (originalArray.length == 0) ? 0 : (double) sumOfListElements / originalArray.length;
    }

    private void printArrayOfReferences(String message, Object[] arrayToPrint) {
        System.out.print(message);
        Arrays.stream(arrayToPrint).forEach(n -> System.out.print(n + " "));
        System.out.print("\n");
    }

    private void printPrimitiveArray(String message, int[] arrayToPrint) {
        System.out.print(message);
        Arrays.stream(arrayToPrint).forEach(n -> System.out.print(n + " "));
        System.out.print("\n");
    }


    public int sumOfPositiveElements(int[] array) {
        printPrimitiveArray("Original array: ", array);
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                continue;
            }
            sum += array[i];
        }
        return sum;
    }

    public void replaceDuplicateElementsWithZero(int[] array) {
        printPrimitiveArray("Origin array: ", array);
        int[] arrayWithZeroInsteadOfDuplicates = replaceDuplicatedWithZero(array, findDuplicates(array));
        printPrimitiveArray("Array after all duplicates were replaced with zero: ", arrayWithZeroInsteadOfDuplicates);
    }

    private int[] replaceDuplicatedWithZero(int[] array, int[] duplicates) {
        for (int i = 0; i < duplicates.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (duplicates[i] == array[j]) {
                    array[j] = 0;
                }
            }
        }
        return array;
    }

    private int[] findDuplicates(int[] array) {
        int[] duplicatesArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    duplicatesArray[i] = array[j];
                    break;
                }
            }
        }

        return duplicatesArray;
    }
}
