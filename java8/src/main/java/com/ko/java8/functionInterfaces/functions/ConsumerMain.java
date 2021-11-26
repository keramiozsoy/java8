package com.ko.java8.functionInterfaces.functions;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class ConsumerMain {
    public static void main(String[] args) {
        Consumer<String> consumer = s -> System.out.println(s.toUpperCase());

        Stream<String> alphabet = Stream.of("a", "b", "c", "d");
        alphabet.forEach(consumer);
    }
}
