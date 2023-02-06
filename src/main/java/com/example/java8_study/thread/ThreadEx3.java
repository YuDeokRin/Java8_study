package com.example.java8_study.thread;

/*
    Thread를 깨우는 방법 : 인터럽트(interrupt)
 */
public class ThreadEx3 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            while (true) { //무한 루프
                System.out.println("Thread : " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000L); // 1초 재우기
                } catch (InterruptedException e) { // 어떤것이 이 스레드를 인터럽트를 하면 return 한다. -> 즉 종료가된다.
                    System.out.println("exit!");
                    return; // run()는 void 타입이다. void타입에서 return을 할 경우 종료된다.
                }
            }
        });
        thread.start(); // 스레드 시작과 동시에 -> sleep(1000L)(=1초)동안 작동되지않는다. 그러므로 다른 스레드가 서버 리소스로 접근할 수 있다.

        System.out.println("Hello : " + Thread.currentThread().getName());
        Thread.sleep(3000L);
        thread.interrupt(); // interrupt는 therad를 종료 시키는게 아니고 꺠우는 것이다. -> interrupt를 실행하여 예외(interrupt)를 발생시킨다. 종료시키는건 내가 그렇게함
    }
}
