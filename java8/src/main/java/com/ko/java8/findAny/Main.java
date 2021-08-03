package com.ko.java8.findAny;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        // sequential stream
        Stream.of("lemon","apple","orange","pineapple")
                .findAny()
                .ifPresent(System.out::println);

        // parallel stream
        Stream.of("lemon","apple","orange","pineapple")
                .parallel()
                .findAny()
                .ifPresent(System.out::println);

    }
}
