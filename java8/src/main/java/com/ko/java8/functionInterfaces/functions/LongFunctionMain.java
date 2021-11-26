package com.ko.java8.functionInterfaces.functions;

import java.util.function.LongFunction;

public class LongFunctionMain {
    public static void main(String[] args) {
        LongFunction<Double> function = value -> Double.valueOf(value);
        //IntFunction<Double> function = Double::valueOf;

        final Double applied = function.apply(5L);
        System.out.println(applied);
    }
}
