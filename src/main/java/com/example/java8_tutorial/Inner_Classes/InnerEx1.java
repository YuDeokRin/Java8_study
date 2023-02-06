package com.example.java8_tutorial.Inner_Classes;

public class InnerEx1 {

    // 내부 클래스 (non-static nested classes)
    class InstanceInner{
        int iv = 100;
        //static int cv = 100; // Error  :  static 변수를 선언할 수 없다.
        final static int CONST = 100; // final static은 상수이므로 허용된다.
    }

    //static 중첩 클래스 (static nested classes)
    /*
        내부 클래스 중에서 static class만 static 멤버를 가질 수 있다.

     */
    static class StaticInner{
        int iv = 200;
        static int cv = 200;
    }

    //메소드
    void myMethod(){
        class LocalInner{
            int iv  = 300;
            //static int cv = 300; // Error : static 변수를 선언 할 수 없다.
            final static int CONST = 300;
        }
    }

    public static void main(String[] args) {
        System.out.println(InstanceInner.CONST); // InnerEx1안에 있는 InstaceInner 클래스에서 CONST는 ? 100
        System.out.println(StaticInner.cv); // InnerEx1안에 있는 StaticInner 클래스에서 참조하는 값 CONST ? 200
    }
}
