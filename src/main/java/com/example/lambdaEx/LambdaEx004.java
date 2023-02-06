package com.example.lambdaEx;

@FunctionalInterface
interface MyFunction2 {
    void myMethod(); // 추상메서드
}

public class LambdaEx004 {
    void aMethod(MyFunction2 f) {
        f.myMethod();
    }

    public static void main(String[] args) {
        LambdaEx004 T = new LambdaEx004();
        MyFunction2 f = () -> System.out.println("myMethod()") ;
        T.aMethod(f);
        T.aMethod(() -> System.out.println("myMethod()"));

    }
}
