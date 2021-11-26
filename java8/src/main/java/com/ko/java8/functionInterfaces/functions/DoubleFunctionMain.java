package com.ko.java8.functionInterfaces.functions;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.function.DoubleFunction;

public class DoubleFunctionMain {
    public static void main(String[] args) {

        DoubleFunction<BigDecimal> func = value ->
                BigDecimal.valueOf(value).setScale(2, RoundingMode.DOWN);

        System.out.println(func.apply(0.5544));

    }
}
