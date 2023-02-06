package com.example.java8_study.provided_interface;

import java.util.function.Function;

public class Provided_Function {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.apply(1));
    }
}


class A implements Function<Integer, Integer> {
    @Override
    public Integer apply(Integer integer) {
        return integer + 10;
    }
}
