package com.example.lambdaEx;

import java.util.*;


interface MyFunction{
    abstract int max(int a, int b);
}


// 제약사항 : 함수형 인터페이스는 오직 하나의 추상 메서드만 정의되어 있어야 한다.
//          그래야지 람다식과 인터페이스의 메서드가 1:1 로 연결될 수 있기 때문이다.
@FunctionalInterface
interface Myfunction2{ // 함수형 인터페이스 MyFunction을 정의
    abstract int max2(int a, int b);
}

public class Lambda01 {

    int max(int a, int b) {
        return a > b ? a : b;
    }

    public static void main(String[] args) {
        Lambda01 T = new Lambda01();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];
        Arrays.setAll(arr, (i) -> (int) (Math.random() * 5) + 1);

        //메소드를 사용
        T.max(1, 3);



        // 인터페이스 만들고 인터페이스를 구현한 익명 클래스
        MyFunction f = new MyFunction() {
            @Override
            public int max(int a, int b) {
                return 0;
            }
        };

        int big = f.max(5, 3);  //익명 객체의 메소드를 호출



        //람다식
        MyFunction f1 = (int a, int b) -> a > b ? a : b; // 익명의 객체를 람다식으로 대체
        int LambdaBig = f1.max(5, 3);

        // 이처럼 MyFunction인터페이스를 구현한 익명 객체를 람다식으로 대체가 가능한 이유는, 람다식도 실제로는 익명 객체이고, MyFunction인터페이스를
        // 익명 객체의 메서드 max()와 람다식의 매개변수의 타입과 개수 그리고 반환값이 일치하기 때문이다.
        // 인터페이스를 통해서 람다식을 다루기로 결정되었으며, 람다식을 다루기 위한 인터페이스를 '함수형 인터페이스(function interface)'라고 한다.



        List<String> list = Arrays.asList("abc", "aaa", "bbb", "ddd", "aaa");
        Collections.sort(list, new Comparator<String>(){
            public int compare(String s1, String s2){
                return s2.compareTo(s1);
            }
        });

        System.out.println(list);


        Collections.sort(list, (s1, s2) -> s2.compareTo(s1));

        System.out.println(list);

        MyFunction3 f3 = () -> System.out.println("myMethod()");

        System.out.println(f3);
    }


    MyFunction3 myMethod(){
        MyFunction3 f4 = () -> {};
        return f4;
    }

    void aMethod(MyFunction3 f) { // 매개변수의 타입이 함수형 인터페이스
        f.myMethod(); // MyFunction에 정의된 메서드 호출
    }

        MyFunction3 f = () -> System.out.println("myMethod()");
}


    @FunctionalInterface
    interface MyFunction3{
        void myMethod(); // 추상 메서드
    }

