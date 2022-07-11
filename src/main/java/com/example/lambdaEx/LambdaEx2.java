package com.example.lambdaEx;

interface MyFunctionEx{
    void run(); // public abstract void run();
}

public class LambdaEx2 {
    static void execute(MyFunctionEx f) {// 매개변수의 타입이 MyFunctionEx인 메서드
        f.run();
    }

    static MyFunctionEx getMyFunction(){ // 반환 타입이 MyFunctionEx인 메서드
        MyFunctionEx f = () -> System.out.println("f3.fun()") ;
        return f;
    }

    public static void main(String[] args) {
        //람다식으로 MyFunctionEx의 run() 구현
        MyFunctionEx f1 = () -> System.out.println("f1.run()");

        MyFunctionEx f2 = new MyFunctionEx() { // 익명클래스로 run()을 구현

            public void run() {     // public 을 반드시 붙어야한다.
                System.out.println("f2.run()");
            }
        };

        MyFunctionEx f3 = getMyFunction();

        f1.run();
        f2.run();
        f3.run();

        execute(f1);
        execute(() -> System.out.println("run()"));


    }

}



