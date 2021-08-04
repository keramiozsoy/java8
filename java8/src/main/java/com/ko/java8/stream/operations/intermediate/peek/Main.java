package com.ko.java8.stream.operations.intermediate.peek;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("one", "two", "three", "four");

        // peek() method exists mainly to support debugging
        listOfStrings.stream()
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());
    }

}
