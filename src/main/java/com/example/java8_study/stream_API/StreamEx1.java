package com.example.java8_study.stream_API;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx1 {

    public static void main(String[] args) {
        List<OnlineClass> springClasses = new ArrayList<>();
        springClasses.add(new OnlineClass(1, "spring boot", true));
        springClasses.add(new OnlineClass(2, "spring date jap", true));
        springClasses.add(new OnlineClass(3, "spring mvc", false));
        springClasses.add(new OnlineClass(4, "spring core", false));
        springClasses.add(new OnlineClass(5, "rest api development", false));


        System.out.println("spring으로 시작하는 수업");
        springClasses.stream()
                .filter(oc -> oc.getTitle().startsWith("spring")) // stream이라는 통로에 filter(Operation)를 넣어서 oc(onlineClass 타입만 지나간다
                                                                  // getTitle중에서 spring으로 시작하는 것을 찾아서
                .forEach((oc -> System.out.println(oc.getId()))); // forEach(Operation) -> terminal operation (종료Operation) -> 아무것도 return 하지 않는다
        springClasses.stream()
                .filter(oc -> oc.getTitle().startsWith("spring")) // 매개변수 : oc (OnlineClass)를 받고 oc.getTitle()로 Title을 불러오고 불러온것 중에서 시작이 spring으로 시작하는 것을 추출
                .forEach(oc ->System.out.println(oc.getTitle())); // forEach로 oc.geTitle에 잇는 것들을 출력


        System.out.println("close되지 않은 수업");
        springClasses.stream()
                        .filter(oc -> !oc.isClosed())
                        .forEach(oc -> System.out.println(oc.getId()));
        System.out.println(" ----------------임의 객체에 인스턴스 메소드 참조하는방법으로 -----------------------------");
        springClasses.stream()
                .filter(Predicate.not(OnlineClass::isClosed)) //임의 객체에 인스턴스메소드 참조하는 방법  -> 메소드 컨퍼런스 참고
                .forEach(oc -> System.out.println(oc.getId()));


        System.out.println("수업 이름만 모아서 스트림 만들기 ");
        springClasses.stream()
                .map(oc -> oc.getTitle()) //map은 들어올떄는 oc-> stream()  다른타입->
                .forEach(s -> System.out.println(s));
        System.out.println("---------------------------method reference---------------------");
        //method reference로 구현
        springClasses.stream()
                .map(OnlineClass::getTitle)
                .forEach(System.out::println);


        List<OnlineClass> javaClass = new ArrayList<>();
        javaClass.add(new OnlineClass(6, "The Java, Test", true));
        javaClass.add(new OnlineClass(7, "The Java, Code manipulation", true));
        javaClass.add(new OnlineClass(8, "The Java, 8 to 11", false));

        List<List<OnlineClass>> danteEvents = new ArrayList<>();
        danteEvents.add(springClasses);
        danteEvents.add(javaClass);

        System.out.println("두 수업 목록에 들어 있는 모든 수업 아이디 출력");
        danteEvents.stream()
                        .flatMap(list -> list.stream())
                                .forEach(oc -> System.out.println(oc.getId()));

        System.out.println("-----------------------------------------");
        danteEvents.stream()
                .flatMap(Collection::stream)
                .forEach(oc -> System.out.println(oc.getId()));

        System.out.println("10부터 1씩 증가하는 무제한 스트림 중에서 아펭 10개 빼고 최대 10개 까지만");
        //Stream.iterate(10, i -> i + 1)
                //.forEach(System.out::println); //


        Stream.iterate(10, i -> i + 1) //  seed는 10부터 하라는 것 i -> i + 1; 1씩 증가
                .skip(10) // 처음 10개는 skip하고
                .limit(10) // 최대 10개까지만
                .forEach(System.out::println); // 출력

        System.out.println("자바 수업 중에 Test가 들어있는 수업이 있는지 확인");
        boolean test = javaClass.stream().anyMatch(oc -> oc.getTitle().contains("Test"));// boolean 이 return 된다.
        System.out.println(test);


        System.out.println("스프링 수업 중에 제목에 spring이 들어간 제목만 모아서 List로 만들기");
        List<String> spring = springClasses.stream().filter(oc -> oc.getTitle().contains("spring"))
                .map(OnlineClass::getTitle) // .map(oc -> oc.getTitle())
                .collect(Collectors.toList());// 

        spring.forEach(System.out::println);


        System.out.println("---주의 순서에 따라 타입이 달라진다. ------");
        List<String> spring2 = springClasses.stream()
                .map(OnlineClass::getTitle) // .map(oc -> oc.getTitle())
                .filter(t -> t.contains("spring"))
                .collect(Collectors.toList());
        spring2.forEach(System.out::println);




    }
}
