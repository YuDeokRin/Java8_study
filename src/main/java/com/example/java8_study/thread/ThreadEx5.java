package com.example.java8_study.thread;
/*
    수십 수백개의 스레드를 코딩으로 관리하는 것은 불가능하다. -> 그래서 나온것이 Executors -> Executor를 알게되면 -> Future를 사용가능하다.
 */
public class ThreadEx5 {
    public static void main(String[] args) {
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
        try {
            thread.join(); // 대기 도중 메인 스레드를 interrupt한다 ? ->InterruptedException 발생
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(thread + " is finished");

    }
}
