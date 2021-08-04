package com.ko.java8.stream.operations.intermediate.filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        example1();
        example2();
    }

    private static void example1() {
        List<Integer> listOfInteger = Arrays.asList(1,3,4,5,6,7,8,9,12,14,19);

        List<Integer> collect = listOfInteger.stream()
                .filter(element -> element % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(collect);
    }


    private static void example2() {
        List<Integer> listOfInteger = Arrays.asList(1,3,4,5,6,7,8,9,12,14,19);

        Predicate<Integer> integerPredicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if(integer % 2 == 0){
                    return true;
                }
                return false;
            }
        };

        List<Integer> collect = listOfInteger.stream()
                .filter(integerPredicate)
                .collect(Collectors.toList());

        System.out.println(collect);

    }
}
