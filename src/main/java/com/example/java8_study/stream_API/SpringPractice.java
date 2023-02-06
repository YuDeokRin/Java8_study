package com.example.java8_study.stream_API;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SpringPractice {

    private final static List<String> WORDS = Arrays.asList("TONY", "a", "hULK", "B", "america", "X", "nebula", "Korea");

    public static void main(String[] args) {
        List<OnlineClass> springClasses = new ArrayList<>();

        springClasses.add(new OnlineClass(1, "spring boot", true));
        springClasses.add(new OnlineClass(2, "spring data jap", true));
        springClasses.add(new OnlineClass(3, "spring mvc", false));
        springClasses.add(new OnlineClass(4, "spring core", false));
        springClasses.add(new OnlineClass(5, "rest api development", false));

        List<OnlineClass> javaClasses = new ArrayList<>();

        javaClasses.add(new OnlineClass(6, "The java, Test", true));
        javaClasses.add(new OnlineClass(7, "The java, Code manipulation", true));
        javaClasses.add(new OnlineClass(8, "The java, 8 to 11", true));

        List<List<OnlineClass>> danteEvents = new ArrayList<>();



        System.out.println("------spring으로 시작하는 수업------");
        springClasses.stream().filter(oc -> oc.getTitle().startsWith("spring"))
                        .forEach(oc -> System.out.println(oc.getTitle()));

        System.out.println("------close 되지 않은 수업------");
        springClasses.stream().filter(oc -> oc.isClosed())
                        .forEach(oc -> System.out.println(oc.getTitle()));

        System.out.println("------수업 이름만 모아서 스트림 만들기------");
        springClasses.stream().map(oc -> oc.getTitle())
                        .forEach(s -> System.out.println(s));

        System.out.println("------두 수업 목록에 들어있는 모든 수업 아이디 출력------");
        danteEvents.stream().flatMap(list -> list.stream())
                .forEach(oc -> System.out.println(oc.getId()));

        System.out.println("------10부터 1씩 증가하는 무제한 스트림 중에서 앞에 10개 빼고 최대 10개 까지만------");
        Stream.iterate(10, i -> i + 1)
                        .skip(10)
                        .limit(10)
                        .forEach(i -> System.out.println(i));

        System.out.println("------자바 수업 중에 Test가 들어있는 수업이 있는지 확인------");
        boolean test = javaClasses.stream().anyMatch(oc -> oc.getTitle().contains("Test"));
        System.out.println(test);

        System.out.println("------스프릥 수업 중에 제목에 spring이 들어간 것만 모아서 List로 만들기------");
        List<String> spring = springClasses.stream().filter(oc -> oc.getTitle().contains("spring"))
                        .map(OnlineClass::getTitle)
                        .collect(Collectors.toList());

        System.out.println(spring);

        // private final static List<String> WORDS = Arrays.asList("TONY", "a", "hULK", "B", "america", "X", "nebula", "Korea");
        System.out.println("List에 저장된 단어들의 접두사가 각각 몇개씩 있는지 Map<String, Integer>으로 변환하여라 ex) (\"T\", 1), (\"a\", 2) ...");

        System.out.println(quiz1());
    }
        public static Map<String, Integer> quiz1(){
            return WORDS.stream()
                    .map(w -> w.substring(0,1))
                    .collect(Collectors.toMap(prefix -> prefix, prefix -> 1
                            ,(oldValue, newValue) -> (newValue += oldValue)));
        }
}
