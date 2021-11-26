package com.ko.java8.functionInterfaces.functions;

import java.util.function.LongToDoubleFunction;

public class LongToDoubleFunctionMain {
    public static void main(String[] args) {
        LongToDoubleFunction function = value -> value;

        final double applied = function.applyAsDouble(5L);

        System.out.println(applied);

    }
}
