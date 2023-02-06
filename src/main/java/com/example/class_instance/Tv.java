package com.example.class_instance;

public class Tv {
    String color;
    boolean power;
    int channel;

    void power(){
        power = !power;
    }

    void channelUp(){
        ++channel;
    }

    void channelDown(){
        --channel;
    }
}


class TvTest{
    public static void main(String[] args) {
        Tv t;
        t = new Tv();
        t.channel = 7;
        t.channelDown();
        System.out.println(t.channel);
    }
}