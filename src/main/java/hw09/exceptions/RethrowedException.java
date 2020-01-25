package hw09.exceptions;

public class RethrowedException {

    public void someMethod() throws Exception {
        try {
            someMethod2();
        } catch (Exception e) {
            throw e;
        }
    }

    public void someMethod2() throws Exception {
        throw new Exception("Initial throwing exception");
    }
}
