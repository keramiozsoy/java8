package com.ko.java8.stream.operations.intermediate.limit;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> listOfInteger = Arrays.asList(10, 50, 40, 30, 70, 60, 20, 90);

        final List<Integer> collect = listOfInteger.stream()
                .limit(3)
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
