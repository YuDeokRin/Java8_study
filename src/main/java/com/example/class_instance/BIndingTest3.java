package com.example.class_instance;
/*
    자손 클래스 Child에 선언된 인스턴스변수 x와 조상 클래스 Parent로부터 상속받은 인스턴스변수 x를 구분하는데
    참조 변수 super와 this가 사용된다. 자손인 Child클래스에서의 super.x는 조상클래스인 Parent에 선언된 인스턴스변수 x를 뜻하며,

 */
class Parent3{
    int x = 100;
    void method(){
        System.out.println("Parent Method");
    }
}

class Child3 extends Parent3{
    int x = 200;
    void method(){
        System.out.println("x = "+ x); //
        System.out.println("super.x =" + super.x);
        System.out.println("this.x = " + this.x);

    }
}

public class BIndingTest3 {
    public static void main(String[] args) {
        Parent3 p = new Child3(); //참조타입 : Parent , instance는 Child이다.
        Child3 c = new Child3(); // 참조타입 : Child , instance는 Child이다.

        System.out.println("p.x = " + p.x); //100
        p.method(); // x, super.x, this.x  =  200, 100, 200
        System.out.println();
        System.out.println("c.x = " + c.x); // 200
        c.method(); // 200, 100, 200

    }
}
