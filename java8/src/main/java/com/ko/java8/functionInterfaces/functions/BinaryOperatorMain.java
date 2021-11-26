package com.ko.java8.functionInterfaces.functions;

import java.util.function.BiFunction;

public class BinaryOperatorMain {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> func = (x1, x2) -> x1 + x2;

        Integer result = func.apply(2, 3);

        System.out.println(result);
    }
}
