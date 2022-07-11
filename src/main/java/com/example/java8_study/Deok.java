package com.example.java8_study;

import java.util.function.Function;

public class Deok {
    public static void main(String[] args) {
//        Function<Integer, Integer> plus10 = (i) -> {
//           return i + 10;
//        };
//        위에 것을 아래의 람다로 표현

        Function<Integer, Integer> plus10 = (i) -> i + 10; // Function<T, R>  -> T: Integer(매개변수) , R : Integer(리턴)
        Function<Integer, Integer> multiply2 = (i) -> i * 2;
//        Plus10 plus10 = new Plus10();
        System.out.println(plus10.apply(1));
        System.out.println(multiply2.apply(1));

        // 위에 두 함수를 조합할 수 있다.
        Function<Integer, Integer> multiply2AndPlus10 = plus10.compose(multiply2);// compose가 입력값을 뒤에 오는 함수에 적용한다. 결과값을 plus10에 넣고  plus10에 입력값으로 사용한다. // +10.compose(*2)
        System.out.println(multiply2AndPlus10.apply(2));
    }
}
