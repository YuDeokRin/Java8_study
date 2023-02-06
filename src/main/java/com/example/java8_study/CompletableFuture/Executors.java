package com.example.java8_study.CompletableFuture;


import java.util.concurrent.ExecutorService;

public class Executors {

    public static void main(String[] args) {
        ExecutorService executorService = java.util.concurrent.Executors.newSingleThreadExecutor();
        /*
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread " + Thread.currentThread().getName());
            }
        });

         */

//        executorService.execute(() -> System.out.println("Thread " + Thread.currentThread().getName()));


        executorService.submit(() -> System.out.println("Thread " + Thread.currentThread().getName()));



        //executorService.shutdown(); // gracefull shutdown으로 되어있다.

        executorService.shutdownNow(); // command + B 해서 들어가서 읽어보기.
    }
}
