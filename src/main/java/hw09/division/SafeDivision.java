package hw09.division;

import java.util.Scanner;

public class SafeDivision {

    Scanner scanner = new Scanner(System.in);
    private int resultOfDivision = 0;

    public void getDivisionResultOfTwoNumbers() {
        System.out.println("Enter first variable: ");
        int firstNumber = scanner.nextInt();
        int resultOfDivision = division(firstNumber);
        System.out.println("Result of division is " + resultOfDivision);
    }

    private int division(int firstNumber) {
        System.out.println("Enter second variable: ");
        int secondNumber = scanner.nextInt();
        try {
            resultOfDivision = firstNumber / secondNumber;
        } catch (ArithmeticException e) {
            division(firstNumber);
        } finally {
            return resultOfDivision;
        }
    }
}
