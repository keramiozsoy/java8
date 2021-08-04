package com.ko.java8.stream.operations.intermediate.flatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        example1();
        example2();
        example3();
    }

    private static void example1(){
        List<List<String>> listOflistOfStrings = new ArrayList<>(Arrays.asList(
                Arrays.asList("A", "B", "C", "D", "E"),
                Arrays.asList("D", "E", "F", "G", "H")
        ));

        System.out.println("example1 " + listOflistOfStrings);

        List<String> listOfIntegers = listOflistOfStrings.stream()
                .flatMap(strings -> strings.stream())
                .collect(Collectors.toList());

        System.out.println("example1 " + listOfIntegers);
    }

    private static void example2(){
        List<Integer> integersLessThan100 = Arrays.asList(60, 70, 80,90);

        List<Integer> integersLessThan70 = Arrays.asList(40, 50, 60);

        List<List<Integer>>  listOfListOfInteger = Arrays.asList(integersLessThan70, integersLessThan100);

        System.out.println("example2 " + listOfListOfInteger);

        final List<Integer> collect = listOfListOfInteger.stream()
                .flatMap(e -> e.stream()
                        .filter( f -> f < 70 )
                ).collect(Collectors.toList());

        System.out.println("example2 " + collect);

    }

    private static void example3(){
        List<Employee> listOfEmployeeLessThan25 = Arrays.asList(
                new Employee(1L,"George", 20),
                new Employee(2L,"Lily", 22),
                new Employee(3L,"Mike", 19)
        );

        List<Employee> listOfEmployeeGreatherThan25 = Arrays.asList(
                new Employee(4L,"Leo", 27),
                new Employee(5L,"Ash", 29),
                new Employee(6L,"Raphael", 30)
        );

        List<List<Employee>> listOfListOfEmployee = Arrays.asList(listOfEmployeeLessThan25, listOfEmployeeGreatherThan25);

        System.out.println("example3 " + listOfListOfEmployee.size());

        List<Employee> listOfAges =
                listOfListOfEmployee.stream()
                .flatMap(e -> e.stream())
                .collect(Collectors.toList());

        System.out.println("example3 " + listOfAges.size());

        listOfAges.stream().map(employee -> employee.name).forEach(System.out::println);

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
