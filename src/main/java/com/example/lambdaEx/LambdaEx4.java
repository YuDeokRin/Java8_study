package com.example.lambdaEx;

interface Myfunction4{
    void myMethod();
}

class Outer{
    int val = 10 ; // Outer.this.val


    //내부 클래스
    class Inner {
        int val = 20 ; // this.val;

        void method(int i) {
            int val = 30;// final int val  =30;
            //i = 10; //Error 상수의 값을 변경할 수 없음.

            Myfunction4 f = () ->{
                System.out.println("             i : " + i);
                System.out.println("           val : " + val);
                System.out.println("      this.val : " + ++this.val);
                System.out.println("Outer.this.val : " + ++Outer.this.val);
            };

            f.myMethod();
        }
    }//Inner 클래스 종료
} // Outer클래스 종료


public class LambdaEx4{
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.method(100);
    }
}