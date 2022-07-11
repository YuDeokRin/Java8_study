package com.example.lambdaEx;

@FunctionalInterface
interface MyFunctionEx2{
    void MyMethod(); // pubic abstract void myMethod();
}

public class LambdaEx3 {
    public static void main(String[] args) {
        MyFunctionEx2 f = () -> {}; // MyFunctionEx2 f =  (MyFunction) (() -> {});
        Object obj = (MyFunctionEx2) (() ->{}); // Object타입으로 형변환이 생략됨
        String str = ((Object)(MyFunctionEx2) (() -> {})).toString();

        System.out.println(f);
        System.out.println(obj);
        System.out.println(str);


        //System.out.println(() ->{}); // Error  람다식은 Object타입으로 형변환 안된다.
        System.out.println((MyFunctionEx2) (() -> {}));
        //System.out.println((MyFunctionEx2) (() -> {}).toString()); // Error
        System.out.println(((Object) (MyFunctionEx2) (() -> {})).toString());

    }

}
