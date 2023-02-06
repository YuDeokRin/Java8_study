package com.example.lambdaEx;

interface MyFunction007{
    void myMethod();
}
public class LambdaEx007 {
    public static void main(String[] args) {
        MyFunction007 f = () ->{}; // MyFunction007 f = (MyFunction007)() ->{};
        Object obj = (MyFunction007) (() -> {}); //Object타입으로 형변환이 생략됨
        String str = ((Object)(MyFunction007) (() -> {})).toString();

        System.out.println(f);
        System.out.println(obj);
        System.out.println(str);

        System.out.println((MyFunction007) (() -> {}));
//        System.out.println((MyFunction007) (() -> {}).to.String());
//        System.out.println(((Object)(MyFunction) (() -> {})).toString());
    }
}
