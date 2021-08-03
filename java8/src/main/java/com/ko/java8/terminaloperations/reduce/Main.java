package com.ko.java8.terminaloperations.reduce;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        final Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        // take 2 element -> remove second element
        Integer lastElement = integerStream.reduce((first,second) -> second ).orElse(-1);

        System.out.println(lastElement);

    }
}
