package com.example.java8_study.default_interface;

public interface Hi {

    void printName();


    /**
     * @implSpec 이 구현체는 getName()으로 가져온 문자열을 대문자로 바꿔서 출력한다.
     */
    default void PrintNameUpperCase(){
        System.out.println(getName().toUpperCase());
    }

    /*
    //Object가 제공하는 기능 (equals, hasCode)는 기본 메소드로 제공할 수 없다.
    //Default method 'toString' overrides a member of 'java.lang.Object'
    default String toString() {

    }


    String toString(); //이런 식으로 추상메서드로 선언은 가능하다.

    */


    static void printAnything() {
        System.out.println("Hi");
    }

    String getName();
}
