package com.ko.java8.functionInterfaces.functions;

import java.util.function.IntPredicate;

public class IntPredicateMain {
    public static void main(String[] args) {
        IntPredicate predicate = (x)-> x < 0;

        System.out.println(predicate.test(123));

    }
}
