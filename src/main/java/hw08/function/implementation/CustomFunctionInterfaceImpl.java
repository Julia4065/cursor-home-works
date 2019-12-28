package hw08.function.implementation;

import java.util.function.Function;

public class CustomFunctionInterfaceImpl {

    public void evaluateValue(Integer value) {

        Function<Integer, String> functionImpl = o -> {
            String valueEvaluation = (o > 5) ? "Value more than 5" : "Value less than 5";
            return valueEvaluation;
        };

        System.out.println(functionImpl.apply(value));
    }
}
