package com.ko.java8.stream.operations.intermediate.skip;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Integer> listOfInteger = Arrays.asList(1,3,4,6,7,2,8,9);

        List<Integer> collect = listOfInteger.stream().skip(5).collect(Collectors.toList());

        System.out.println(collect);
    }
}
