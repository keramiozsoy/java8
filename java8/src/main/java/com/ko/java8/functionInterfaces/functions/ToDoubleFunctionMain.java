package com.ko.java8.functionInterfaces.functions;

import java.util.function.ToDoubleFunction;

public class ToDoubleFunctionMain {
    public static void main(String[] args) {
        ToDoubleFunction<Long> function = value -> value;

        final double applied = function.applyAsDouble(4L);
        System.out.println(applied);
    }
}
