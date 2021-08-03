package com.ko.java8.terminaloperations.distinct;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));

        List<Integer> withoutDuplicate = integerList
                .stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(withoutDuplicate);
    }
}
