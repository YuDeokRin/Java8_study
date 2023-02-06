package com.example.java8_study.thread;
/*
    2. Thread의 생성자에  Runnable를 주는 방법

    Thread thread = new Thread(() ->{}); // 자바 8 이전에는 익명클래스로 구현해서 사용했다.
 */
public class ThreadEx2 {
    public static void main(String[] args) {
        //Runnable이 functional interface로 바뀐것이라 가능
        Thread thread = new Thread(() ->{
            try {
                Thread.sleep(1000L); //sleep을 하는 경우 -> 다른 스레드에게 우선권이 간다. -> 다른 스레드한테 서버 리소스를 쓸 수 있는 기회를준다.
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Thread : " + Thread.currentThread().getName());

        });
        thread.start(); // 스레드 시작과 동시에 -> sleep(1000L)(=1초)동안 작동되지않는다. 그러므로 다른 스레드가 서버 리소스로 접근할 수 있다.
        System.out.println("Hello : " + Thread.currentThread().getName());

/*        여러줄로 바디를 작성할 때
       Thread thread = new Thread(() -> {
            System.out.println("Therad : " + Thread.currentThread().getName());
            System.out.println("Therad : " + Thread.currentThread().getName());
        });
        thread.start();
        System.out.println("Hello :" + Thread.currentThread().getName());
 */

/*

        Thread thread = new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println("Therad : " + Thread.currentThread().getName());
            }
        });
        thread.start();
        System.out.println("Hello :" + Thread.currentThread().getName());
 */

    }



}
