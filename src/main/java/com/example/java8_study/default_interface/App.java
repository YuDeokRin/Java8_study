package com.example.java8_study.default_interface;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App{

    public static void main(String[]args) {
        List<String> names =new ArrayList<>();

        names.add("Dante");
        names.add("Deok");
        names.add("rin");
        names.add("Hi");

        Stream<String> stringStream = names.stream().map(String::toUpperCase);

        names.forEach(System.out::println);

        System.out.println("========");

        //중개형 오퍼레이터
        names.stream().map((s) ->{
            System.out.println(s);
            return s.toUpperCase();
        });

        System.out.println("-----------------");
        // 중개형 오퍼레이터가 혼자 있으면 작동을안한다. 마지막 꼭 종료형 오퍼레이터가 필요할 것이다 .
        names.stream().map((s) -> {
            System.out.println(s);
            return s.toUpperCase();
        }).collect(Collectors.toList());


        System.out.println("========");
        names.forEach(System.out::println);


        for (String name : names) {
            if (name.startsWith("D")) {
                System.out.println(name.toUpperCase());
            }
        }
    }
}