package com.ko.java8.stream.operations.terminal.reduce;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> listOfInteger = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Integer lastElement = listOfInteger.stream()
                .reduce((first,second) -> second )  // take 2 element -> remove second element
                .orElse(-1);

        System.out.println(lastElement);

    }
}
