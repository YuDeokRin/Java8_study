package com.example.lambdaEx;

public class LambdaEx002 {
    public static void main(String[] args) {
        MyFunction1 f = new MyFunction1() {
            @Override
            public int max(int a, int b) {
                return a > b ? a : b;
            }
        };

        int big = f.max(5, 3);
        System.out.println(big);

        MyFunction1 f1 = (int a, int b) -> a > b ? a : b;
        int big1 = f1.max(6, 3);
        System.out.println(big1);
    }
}
