package com.example.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx2 {
    public static void main(String[] args) {
        List<String> strings = List.of("one", "two", "three", "four");
        Function<String, Integer> toLength = String::length;
        Stream<Integer> ints = strings.stream().map(toLength);

        List<Integer> lengths = strings.stream().map(String::length).collect(Collectors.toList());
        System.out.println("lengths =" + lengths);

        List<OnlineClass> springClasses = new ArrayList<>();
        springClasses.add(new OnlineClass(1, "spring boot", true));
        springClasses.add(new OnlineClass(2, "spring date jpa", true));
        springClasses.add(new OnlineClass(3, "spring mvc", false));
        springClasses.add(new OnlineClass(4, "spring core", false));
        springClasses.add(new OnlineClass(5, "rest api development", false));

        System.out.println("spring으로 시작하는 수업 ");
//        springClasses.stream().filter(oc -> oc.getTitle().startsWith("spring")).forEach(oc -> System.out.println(oc.getId()));
    }
}
