package com.ko.java8.stream.operations.intermediate.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer> listOfInteger = Arrays.asList(1,3,4,5,6,7,8,9,12,14,19);

        List<Integer> collect = listOfInteger.stream()
                .filter(element -> element % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
