package com.ko.java8.functionInterfaces.functions;

import java.util.function.BiFunction;

public class BiFunctionMain {
    public static void main(String[] args) {
        BiFunction<Integer, Double, Long> func = (x1, x2) -> (long) (x1 * x2);

        Long result = func.apply(2, 3.0d);

        System.out.println(result);
    }
}
