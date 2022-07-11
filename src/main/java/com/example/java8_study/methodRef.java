package com.example.java8_study;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class methodRef {
    public static void main(String[] args) {
        Greeting greeting = new Greeting();
        // ::의 뜻은 메소드 레퍼런스
        UnaryOperator<String> hi = Greeting::hi;
    }
}
