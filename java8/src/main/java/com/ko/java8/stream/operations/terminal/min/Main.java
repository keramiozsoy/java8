package com.ko.java8.stream.operations.terminal.min;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        List<Integer> listOfInteger = Arrays.asList(35,6,7,8,90,6,1,4,2);

        final Optional<Integer> min = listOfInteger.stream()
                .min((o1, o2) -> o1.compareTo(o2));

        min.ifPresent(System.out::println);

    }
}
