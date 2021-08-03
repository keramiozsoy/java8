package com.ko.java8.findFirst;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        // sequential stream
        Stream.of("lemon","apple","orange","pineapple")
                .findFirst()
                .ifPresent(System.out::println);

        // parallel stream
        Stream.of("lemon","apple","orange","pineapple")
                .parallel()
                .findFirst()
                .ifPresent(System.out::println);

    }
}
