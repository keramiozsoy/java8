package com.ko.java8.functionInterfaces.functions;

import java.util.function.Function;

public class CustomPowFunctionMain {
    public static void main(String[] args) {
// Default Style
        CustomPowFunction function = new CustomPowFunction();
        final Integer result = function.apply(3);
        System.out.println(result);

// Interface Style
        Function<Integer,Integer> customPowFunction = new CustomPowFunction();
        final Integer customResult = customPowFunction.apply(3);
        System.out.println(customResult);

// Lambda Style
        Function<Integer,Integer> func = (integer) -> integer * integer;
        final Integer funcResult = func.apply(3);
        System.out.println(funcResult);
// Lambda Style
        Runnable r = () -> System.out.println("Hey");
        r.run();

    }
}
