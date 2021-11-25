package com.ko.java8.functionInterfaces.functions;

import java.util.function.Predicate;

public class PredicateMain {

    public static void main(String[] args) {

// Default Style
        Predicate<Integer> integerPredicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if(integer % 2 == 0){
                    return true;
                }
                return false;
            }
        };
        final boolean result = integerPredicate.test(13);
        System.out.println(result);

// Lambda Style

        Predicate<Integer> lambda = integer -> integer % 2 == 0;
        System.out.println(lambda.test(13));

    }
}
