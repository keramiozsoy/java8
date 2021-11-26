package com.ko.java8.functionInterfaces.functions;

import java.util.function.DoubleToIntFunction;

public class DoubleToIntFunctionMain {
    public static void main(String[] args) {
        // only convert
        DoubleToIntFunction function = value -> (int) value;
        // additional operations
        //DoubleToIntFunction function = value -> (int) (value + value);
        //DoubleToIntFunction function = value -> (int) (value  * value);

        final int applied = function.applyAsInt(3.4);
        System.out.println(applied);

    }
}
