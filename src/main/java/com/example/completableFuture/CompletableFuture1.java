package com.example.completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFuture1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /*
        CompletableFuture<String> future = new CompletableFuture<>();
        future.complete("dante"); // future의 기본 값을 "dante" 지정 (명시적 지정)

        System.out.println(future.get()); // 블록킹
        */

        /*
        CompletableFuture<String> future = CompletableFuture.completedFuture("dnate");
        System.out.println(future.get()); // 블록킹
        */

        /*
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            System.out.println("Hello " + Thread.currentThread().getName());
        });

        future.get();
         */


        /*
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            System.out.println("Hello " + Thread.currentThread().getName());
            return "Hello";
        }).thenApply((s) -> {
            System.out.println(Thread.currentThread().getName());
            return s.toUpperCase();
        });

        System.out.println(future.get());


         */

        /*
        //콜백 : 리턴이없다 . 받아서 쓰기만 하면된다.
        CompletableFuture<Void> future = CompletableFuture.supplyAsync(() -> {
            System.out.println("Hello " + Thread.currentThread().getName());
            return "Hello";
        }).thenAccept((s) -> {
            System.out.println(Thread.currentThread().getName());
            System.out.println(s.toUpperCase());
        });

        future.get();

         */

        /*
        // 비동기적으로 작업을 처리하는데 ThreadPool을 만들지도 않고 어떻게 했을까 ?
        // ForkJoinPool(java 7) 때문이다.
        // ForkJoinPool : executor을 구현한 구현체 중 하나. 조금 다른 점은 작업을 워크스틸링(Work Stealing) 알고리즘을 쓴다.
        //                Work Stealing은 간략하게 뜯어보면 Dequeue를 쓴다.
        //                마지막에 들어온게 먼저나간다. 그래서 Dequeue를 써서 쓰레드가 할 일이 없으면 직접 Dequeue에서 자기가 할 일을 가져와서 처리하는 방식의 프레임 워크
        //                작업 단위를 자기가 파생시키는 세부적인 서브테스크가 있다면 서브테스크들을 쪼개서 다른 스레드에 분산 시켜서 작업을 처리하고, 모아서(join) 그 결과 값을 도출해내는 프레임워크

        //ForkJoinPool.commonPool
        CompletableFuture<Void> future = CompletableFuture.supplyAsync(() -> {
            System.out.println("Hello " + Thread.currentThread().getName());
            return "Hello";
        }).thenRun(() -> {
            System.out.println(Thread.currentThread().getName());
        });

        future.get();

         */


        //별다른 Executor를 사용하지 않아도 내부적으로 ForkJoinPool.commonPool를 쓰게 된다.
        //하지만 원한다면 (ExecutorService executorService = Executors.newFixedThreadPool(4);) 만들어서도 줄 수 있다.
        // 만든 것을 어디에 줄 수 있냐 ?
        //supplyAsync() , runAsync() 호출할 때  두 번째 인자로 줄 수 있다.

        ExecutorService executorService = Executors.newFixedThreadPool(4);
        CompletableFuture<Void> future = CompletableFuture.supplyAsync(() -> {
            System.out.println("Hello " + Thread.currentThread().getName());
            return "Hello";
        }, executorService).thenRun(() -> {
            System.out.println(Thread.currentThread().getName()); // Hello pool-1-thread-1
                                                                  // pool-1-thread-1

        });

        future.get();

    }
}
