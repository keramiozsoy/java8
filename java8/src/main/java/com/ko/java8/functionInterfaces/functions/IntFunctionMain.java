package com.ko.java8.functionInterfaces.functions;

import java.util.function.IntFunction;

public class IntFunctionMain {
    public static void main(String[] args) {
        IntFunction<Double> function = value -> Double.valueOf(value);
        //IntFunction<Double> function = Double::valueOf;

        final Double applied = function.apply(5);
        System.out.println(applied);
    }
}
