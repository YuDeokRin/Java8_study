package com.example.lambdaEx;

import java.util.*;
import java.util.function.*;

public class Lambda7 {
    static <Integer> void makeRandomList(Supplier<Integer> s, List<Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add(s.get());
        }
    }

    static void printEvenNum(Predicate<Integer> p, Consumer<Integer> c, List<Integer> list) {
        System.out.print("[");
        for (Integer i : list) {
            if(p.test(i)) c.accept(i);
        }
        System.out.println("]");
    }

    private static List<Integer> doSomething(Function<Integer, Integer> f, List<Integer> list) {
        List<Integer> newList = new ArrayList<Integer>(list.size());

        for (Integer i : list) {
            newList.add(f.apply(i));
        }
        return newList;
    }

    public static void main(String[] args) {
        Supplier<Integer> s = () -> (int)(Math.random()*100) + 1;
        Consumer<Integer> c = i -> System.out.print(i + ", ");
        Predicate<Integer> p = i -> i%2 ==0;
        Function<Integer, Integer> f = i -> i/10 * 10; // i의 일의 자리를 없앤다.

        List<Integer> list = new ArrayList<>();
        makeRandomList(s, list);
        System.out.println(list);
        printEvenNum(p, c, list);

        List<Integer> newList = doSomething(f, list);
        System.out.println(newList);
    }
}
