package com.ko.java8.stream.operations.terminal.anyMatch;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        List<Integer> listOfInteger = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        final boolean result = listOfInteger.stream()
                .anyMatch(element -> element > 7); // is there any element greater than 7

        System.out.println(result);

    }
}
