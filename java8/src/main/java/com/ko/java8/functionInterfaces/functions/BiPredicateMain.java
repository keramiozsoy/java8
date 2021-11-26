package com.ko.java8.functionInterfaces.functions;

import java.util.function.BiPredicate;

public class BiPredicateMain {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> bi = (x, y) -> x > y;

        System.out.println(bi.test(2, 3));
    }
}
