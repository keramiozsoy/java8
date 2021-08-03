package com.ko.java8.stream.operations.intermediate.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Main.example1();
        Main.example2();
    }

    static void example1(){
        List<String> listOfStrings = Arrays.asList("1", "2", "3", "4", "5");

        List<Integer> listOfIntegers = listOfStrings.stream()
                .map(Integer::valueOf)
                .collect(Collectors.toList());

        System.out.println(listOfIntegers);
    }

    static void example2(){
        List<Employee> listOfEmploye = Arrays.asList(
                new Employee(1L,"George", 20),
                new Employee(2L,"Lily", 22),
                new Employee(3L,"Mike", 19)
        );

        List<Integer> listOfAges = listOfEmploye.stream()
                .map(e -> e.age)
                .collect(Collectors.toList());

        System.out.println(listOfAges);

    }

    static class Employee{
        private Long id;
        private String name;
        private Integer age;

        public Employee(Long id, String name, Integer age) {
            this.id = id;
            this.name = name;
            this.age = age;
        }
    }
}