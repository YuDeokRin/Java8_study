package com.example.java8_study.optional_API;

import com.example.java8_study.stream_API.OnlineClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;

/*
    Optional에 값이 있는지 없는지 확인하기
    - isPresent()
    - isEmpty()    <- 자바11에서부터 제공
 */
public class OptionalEx1 {
    public static void main(String[] args) {
        List<OnlineClass> springClasses = new ArrayList<>();

        springClasses.add(new OnlineClass(1, "spring boot", true));
        springClasses.add(new OnlineClass(5, "rest api development", false));

        Optional<OnlineClass> spring = springClasses.stream()
                .filter(oc -> oc.getTitle().startsWith("spring"))
                .findFirst();
        // filter 조건에 일치하는 element 1개를 Optional로 리턴합니다.
        // 조건에 일치하는 요소가 없다면 empty가 리턴된다.


        boolean present  = spring.isPresent();
        System.out.println("제목(title)중에 spring라는 것이 있습니까 ? " + present);


        Optional<OnlineClass> jpa = springClasses.stream()
                .filter(oc -> oc.getTitle().startsWith("jpa"))
                .findFirst();


        boolean present2 = jpa.isPresent();
        System.out.println("제목(title)중에 jap라는 것이 있습니까 ? " +present2);


        // isEmpty() 사용
        Optional<OnlineClass> isEmptyEx = springClasses.stream()
                .filter(oc -> oc.getTitle().startsWith("spring"))
                .findFirst();

        boolean present3 = isEmptyEx.isEmpty();
        System.out.println(present3);




        //findFirst() test용 : 값이 있으면 출력하는데 없으면 런타임에러(NoSuchElementException)이 발생함
        List<String> element = Arrays.asList("a","a1","b","b1");

        Optional<String> firstElement = element.stream()
                .filter(s -> s.startsWith("c"))
                .findFirst();

        System.out.println("findFirst : " + firstElement.get());
        // 값이없을 때 에러가 남
        // java.util.NoSuchElementException: No value present
    }
}
