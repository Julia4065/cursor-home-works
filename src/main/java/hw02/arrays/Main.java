package hw02.arrays;

public class Main {
    private static int[] originArray = {2, 3, 1, 7, 11};
    private static int[] originPrimitiveArray = {1, 2, 4, 4, 7};
    private static int[] originArrayWithPosAndNegElements = {1, -2, 4, -2, 8, -5};
    private static int[] originArrayWithDuplicates = {3, 2, 3, 1, 4, 2, 8, 3};

    public static void main(String[] args) {

        ArrayModifier arrayModifier = new ArrayModifier();

        System.out.println("Task 3");
        arrayModifier.sortArrayDesc(originArray);

        System.out.println("Task 4");
        System.out.println("Sum of all positive elements in the array: " + arrayModifier.getTheSumOfPositiveElements(originArrayWithPosAndNegElements));

        System.out.println("Task 5");
        System.out.println("Average sum of the list of numbers in array: " + arrayModifier.findAverageSumOfListNumbersOf(originPrimitiveArray));

        System.out.println("Task 6");
        arrayModifier.replaceDuplicateElementsWithZero(originArrayWithDuplicates);
    }
}
