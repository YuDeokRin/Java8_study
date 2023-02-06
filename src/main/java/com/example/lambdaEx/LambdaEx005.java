package com.example.lambdaEx;

@FunctionalInterface
interface MyFunction4{
    void run();
}


public class LambdaEx005{
    static void execute(MyFunction4 f){ //매개변수의 타입이 MyFunction3인 메서드
        f.run();
    }

    static MyFunction4 getMyFunction3() { // 반환 타입이 MyFunction인 메서드
        MyFunction4 f = () -> System.out.println("f3.run()");
        return f;
    }

    public static void main(String[] args) {
        //람다식으로 MyFunction4 의 run() 구현
        MyFunction4 f1 = () -> System.out.println("f1.run()");

        //익명클래스로 run() 구현
        MyFunction4 f2 = new MyFunction4() {
            @Override
            public void run() {
                System.out.println("f2.run()");
            }
        };
        MyFunction4 f3 = getMyFunction3();

        f1.run();
        f2.run();
        f3.run();

        execute(f1);
        execute(() -> System.out.println("run()"));
    }

}


