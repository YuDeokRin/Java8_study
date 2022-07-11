package com.example.java8_study.default_interface;

public interface bar extends Hi{

    //bar에서는 Hi가 제공하는 PrintNameUpperCase()를 제공하고 싶지않다. -> 해결법
    void PrintNameUpperCase(); // 이렇게할 때 bar를 구현하는 인스턴스들은 다 재정의 해줘야한다.



}
