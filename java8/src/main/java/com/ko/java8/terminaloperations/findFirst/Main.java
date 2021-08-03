package com.ko.java8.terminaloperations.findFirst;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // sequential stream
        List<String> fruitList = new ArrayList<>(Arrays.asList("lemon","apple","orange","pineapple"));

        fruitList.stream()
                .findFirst()
                .ifPresent(System.out::println);

        // parallel stream
        fruitList.stream()
                .parallel()
                .findFirst()
                .ifPresent(System.out::println);

    }
}
