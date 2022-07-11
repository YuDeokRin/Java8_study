package com.example.lambdaEx;

import java.util.function.Predicate;

public class LambdaEx5 {
    public static void main(String[] args) {
        Predicate<String> isEmptyStr = s -> s.length() == 0;
        String s = "" ;

        if(isEmptyStr.test(s)) {// if(s.length() == 0);
            System.out.println("This is an Empty String.");
        } else{ // 문자가 들어있는 경우
            System.out.println(s);
        }



    }
}
