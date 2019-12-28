package hw09.executor;

import hw09.exceptions.ExceptionA;
import hw09.exceptions.ExceptionB;
import hw09.exceptions.RethrowedException;
import hw09.division.SafeDivision;

import java.io.IOException;

public class Executor {

    public void demonstrateHomeWork9() {
        catchExceptions();
        showResultOfDivisionOfTwoNumbers();
        rethrowExceptions();
    }

    private void showResultOfDivisionOfTwoNumbers() {
        new SafeDivision().getDivisionResultOfTwoNumbers();
    }

    private void rethrowExceptions() {
        try {
            new RethrowedException().someMethod();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void catchExceptions() {
        catchExceptionA();
        catchExceptionB();
        catchIOException();
        catchNullPointerException();
    }

    private void catchExceptionA() {
        try {
            throw new ExceptionA();
        } catch (ExceptionA e) {
            System.out.println(e.getClass().getSimpleName() + " was caught");
        }
    }

    private void catchExceptionB() {
        try {
            throw new ExceptionB();
        } catch (ExceptionB e) {
            System.out.println(e.getClass().getSimpleName() + " was caught");
        }
    }

    private void catchIOException() {
        try {
            throw new IOException();
        } catch (IOException e) {
            System.out.println(e.getClass().getSimpleName() + " was caught");
        }
    }

    private void catchNullPointerException() {
        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            System.out.println(e.getClass().getSimpleName() + " was caught");
        }
    }
}