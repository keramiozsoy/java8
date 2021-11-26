package com.ko.java8.functionInterfaces.functions;

import java.util.function.ToIntBiFunction;

public class ToIntBiFunctionMain {
    public static void main(String[] args) {
        ToIntBiFunction<Float,Integer> function = (t,u) -> (int) (t * u);

        final int applied = function.applyAsInt(1.05F, 10);

        System.out.println(applied);

    }
}
