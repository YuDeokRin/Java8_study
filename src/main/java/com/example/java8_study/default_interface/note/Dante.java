package com.example.java8_study.default_interface.note;

public interface Dante {
    void printName();

    //인터페이스에 메소드 선언이 아니라 구현체를 제공하는 방법
    default void printNameUpperCase(){
        System.out.println("Dante");
    }



}
