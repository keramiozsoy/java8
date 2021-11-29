package com.ko.java8.stream.operations.terminal.allMatch;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> listOfInteger = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        final boolean result = listOfInteger.stream()
                .allMatch(element -> element > 7); // are there all element greater than 7

        System.out.println(result);

    }
}
