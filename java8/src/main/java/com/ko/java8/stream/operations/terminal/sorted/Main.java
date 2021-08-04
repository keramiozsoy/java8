package com.ko.java8.stream.operations.intermediate.sorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Main.example1();
        Main.example2();
    }

    private static void example1() {
        List<Integer> listOfInteger = Arrays.asList(10, 50, 40, 30, 70, 60, 20, 90);

        List<Integer> collectedList = listOfInteger.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(collectedList);
    }

    private static void example2() {

        List<Integer> listOfInteger = Arrays.asList(10, 50, 40, 30, 70, 60, 20, 90);

        List<Integer> collectedList = listOfInteger.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(collectedList);

    }
}
