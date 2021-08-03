package com.ko.java8.terminaloperations.findAny;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // sequential stream
        List<String> fruitList = new ArrayList<>(Arrays.asList("lemon","apple","orange","pineapple"));

        fruitList.stream()
                .findAny()
                .ifPresent(System.out::println);

        // parallel stream
        fruitList.stream()
                .parallel()
                .findAny()
                .ifPresent(System.out::println);

    }
}
