package com.ko.java8.stream.operations.terminal.toArray;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> listOfString = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9");

        final String[] strings = listOfString.stream()
                .toArray(String[]::new);

        System.out.println(strings);
    }
}
