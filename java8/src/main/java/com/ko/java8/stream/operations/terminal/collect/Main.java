package com.ko.java8.stream.operations.terminal.collect;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Integer[] integers = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        final List<Integer> collect = Arrays.stream(integers).collect(Collectors.toList());

        System.out.println(collect);
    }
}
