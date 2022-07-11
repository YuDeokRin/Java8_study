package com.example.java8_study.default_interface;

public class DefaultHi2 implements Hi, bar2{

    String name;


    public DefaultHi2(String name) {
        this.name = name;
    }

    @Override
    public void PrintNameUpperCase() {
        System.out.println(this.name.toUpperCase());
    }


    @Override
    public void printName() {
        System.out.println(this.name);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
