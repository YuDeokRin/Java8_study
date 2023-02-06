package com.example.java8_study.thread;

// 1. Thread를 extends(상속)하는 방법

public class ThreadEx1 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread(); // MyThread는 static을 선언해줘야한다. (코드 15줄 확인)
        myThread.start();
        //myThread.run();

        System.out.println("Hello " + Thread.currentThread().getName());
    }


    static class MyThread extends Thread{

        @Override
        public void run() {
            System.out.println("Thread: " + Thread.currentThread().getName());
        }
    }
}
