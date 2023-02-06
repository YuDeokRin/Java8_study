package com.example.lambdaEx;
/*
    람다 식 작성의 이해는 3단계로 나뉜다.
    1. 작성하려는 람다 식의 유형 식별
    2. 구현에 적합한 메소드 찾기
    3. 적합한 메소드로 구현하기


 */

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaDemo1 {
    public static void main(String[] args) {

//        Predicate<String> predicate = (String s) -> {
//            return s.length() == 3;
//        };

        //Simplifying the Syntax
        Predicate<String> predicate = (s) ->  s.length() == 3;

        Consumer<String> print = s -> System.out.println(s);
    }
}
