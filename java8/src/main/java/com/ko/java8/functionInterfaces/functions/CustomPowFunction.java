package com.ko.java8.functionInterfaces.functions;

import java.util.function.Function;

public class CustomPowFunction implements Function<Integer,Integer>, Runnable {
    @Override
    public Integer apply(Integer integer) {
         //Math.pow(sayi,ustel_ifade)
        return integer * integer;
    }

    @Override
    public void run() {
        System.out.println("Test");
    }
}
