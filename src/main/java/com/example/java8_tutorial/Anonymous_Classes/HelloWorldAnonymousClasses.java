package com.example.java8_tutorial.Anonymous_Classes;

/*
   Declaring Anonymous Classes (익명 클래스 선언)
    - local classes는 클래스 선언이지만, anonymous 클래스는 표현식입니다. 즉 다른 표현식에서 클래스를 정의해야 한다.


 */

public class HelloWorldAnonymousClasses {
    interface Helloworld{
        public void greet();
        public void greetSomeone(String someone);
    }

    public void sayHello(){

        class EnglishGreeting implements Helloworld{

            String name = "world";
            @Override
            public void greet() {
                greetSomeone("world");
            }

            @Override
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hello " + name);
            }
        }

        Helloworld englishGreeting = new EnglishGreeting(); //객체 생성


        Helloworld frenchGreeting = new Helloworld() {
            String name = "tout le monde";
            @Override
            public void greet() {
                greetSomeone("tout le monde");
            }
            @Override
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Salut " + name);
            }
        };

        Helloworld spanishGreeting = new Helloworld() {
            String name = "mundo";
            @Override
            public void greet() {
               greetSomeone("mundo");
            }

            @Override
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hola " + name);
            }
        };


        englishGreeting.greet();
        frenchGreeting.greetSomeone("Fred");
        spanishGreeting.greet();
    }

    public static void main(String[] args) {
        HelloWorldAnonymousClasses myApp = new HelloWorldAnonymousClasses();
        myApp.sayHello();
    }
}
