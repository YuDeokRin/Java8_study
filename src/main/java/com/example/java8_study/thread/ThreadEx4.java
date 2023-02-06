package com.example.java8_study.thread;

public class ThreadEx4 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            System.out.println("Thread : " + Thread.currentThread().getName());
            try {
                Thread.sleep(3000L);
            } catch (InterruptedException e) { // 어떤것이 이 스레드를 인터럽트를 하면 return 한다. -> 즉 종료가된다.
                throw new IllegalStateException(e);
            }
        });
        thread.start(); // 스레드 시작과 동시에 -> sleep(1000L)(=1초)동안 작동되지않는다. 그러므로 다른 스레드가 서버 리소스로 접근할 수 있다.

        System.out.println("Hello : " + Thread.currentThread().getName());
        thread.join(); //Thread를 기다리도록 하는 함수 join(); -> 위에 3초 thread가 실행되고 다음 줄이 실행된다.

        System.out.println(thread + " is finished");

    }
}
