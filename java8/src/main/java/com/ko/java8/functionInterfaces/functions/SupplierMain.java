package com.ko.java8.functionInterfaces.functions;

import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierMain {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "ABC_ABC_ABC";

        System.out.println(supplier.get());

        Stream<Integer> stream = Stream.generate(new Fruit()).limit(1);

        // object created because of terminal opt findfirst()
        final Optional<Integer> first = stream.findFirst();

        first.ifPresent(System.out::println);

    }

    public static class Fruit implements Supplier<Integer> {
        private int i = 0;

        @Override
        public Integer get() {
            return ++i;
        }
    }
}
