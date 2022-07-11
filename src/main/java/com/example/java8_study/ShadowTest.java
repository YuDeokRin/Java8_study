package com.example.java8_study;

public class ShadowTest {
    //맴버 변수
    public int x = 0;

    //내부 클래스
    class FirstLevel{
        //내부클래스의 멤버변수
        public int x = 1;

        //내부 클래스(FirstLevel)의 메서드 매개변수
        void methodInFirstLevel(int x){
            System.out.println("x = " + x);
            System.out.println("this.x = " + this.x);
            System.out.println("ShadowTest.this.x = " + ShadowTest.this.x);
        }
    }

    public static void main(String[] args) {
        ShadowTest st= new ShadowTest();
        ShadowTest.FirstLevel fl = st.new FirstLevel();
        fl.methodInFirstLevel(23);
    }
}
