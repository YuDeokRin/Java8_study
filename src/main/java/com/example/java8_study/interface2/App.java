package com.example.java8_study.interface2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class App {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Dante");
        names.add("Deok");
        names.add("rin");
        names.add("Hi");

        //1. forEach

        names.forEach(s ->{
            System.out.println(s);
        });



        System.out.println("------method reference ------------------");
        names.forEach(System.out::println);

        System.out.println("------------------------------");
        //Spliterator :  iterator 에서 쪼갤 수 있는 기능 추가
        Spliterator<String> spliterator = names.spliterator(); //절반으로
        Spliterator<String> spliterator1 = spliterator.trySplit(); // 그 다음 데이터들
        while (spliterator.tryAdvance(System.out::println)) ; // rin, Hi
        System.out.println("=================");
        while(spliterator1.tryAdvance(System.out::println)); // Dante,Deok


        // stream의 기반에 spliterator가  깔려있다.

        Comparator<String> compareToIgnoreCase = String::compareToIgnoreCase;
        names.sort(compareToIgnoreCase); // 문자열로 정렬
//        names.sort(compareToIgnoreCase.reversed().thenComparing());

        names.forEach(System.out::println);

        Comparator<Integer> comparator = Integer::compareTo;

        System.out.println(comparator);


    }
}
