package com.example.java8_study;


import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class Main1{
    public static void main(String[] args){
        Main1 main1 = new Main1();
        main1.run();
    }

    //인스턴스 메소드
    private void run(){
       final int baseNumber = 10;	 // 자바 8 전에는 fianl을 넣어줘야한다.



        //익명 클래스 - Local variable 참조
        Consumer<Integer> integerConsumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer){
                System.out.println(baseNumber);
            }
        };


        //로컬 클래스 - Local variable 참조
        class LocalClass{
            void printBaseNumber(){
                System.out.println(baseNumber);
            }
        }


        //람다 - Local variable 참조
        IntConsumer printInt = (i) -> {
            System.out.println(i + baseNumber);
        };


        printInt.accept(10);

    }
}
