package com.ko.java8.stream.operations.terminal.noneMatch;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> listOfInteger = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        final boolean result = listOfInteger.stream()
                .noneMatch(element -> element > 70); // is there none element greater than 70

        System.out.println(result);

    }
}
