package hw08.function.implementation;

import java.util.function.Function;

public class CustomFunctionInterfaceImpl {

    public void evaluateValue(Integer value) {
        Function<Integer, String> functionImpl = o -> {
            if (o > 5) {
                return "Value more than 5";
            } else {
                return "Value less than 5";
            }
        };

        System.out.println(functionImpl.apply(value));
    }
}
