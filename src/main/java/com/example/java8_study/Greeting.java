package com.example.java8_study;

public class Greeting {
    private String name;

    public Greeting() {
    }

    public Greeting(String name) {
        this.name = name;
    }

    //인스턴스 메소드
    public String hello(String name){
        return "hello" + name;
    }

    public static String hi(String name){
        return "hi" + name;
    }

}

