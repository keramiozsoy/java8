package com.ko.java8.functionInterfaces.functions;

import java.util.function.DoubleUnaryOperator;

public class DoubleUnaryOperatorMain {
    public static void main(String[] args) {
        DoubleUnaryOperator operator = operand -> operand * 3;

        final double applied = operator.applyAsDouble(1.5d);

        System.out.println(applied);

        //  the trigonometric cosine of an angle
        DoubleUnaryOperator operator2 = Math::sin;

        final double applied2 = operator2.applyAsDouble(45);

        System.out.println(applied2);


    }
}
