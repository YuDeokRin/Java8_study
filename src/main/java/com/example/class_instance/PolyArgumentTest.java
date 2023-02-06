package com.example.class_instance;
/*
    고객이 buy(Product p) 메서드를 이용해서 Tv와 Computer를 구입하고, 고객 잔고와 보너스 점수를 출력하는 예제

    매개변수의 다형성의 또 다른 예로 PrintStream클래스에 정의되어있는 print(Object o)메서드를 살펴보자.

    print(Object o )는 매개변수로 Object타입의 변수가 선언되어 있는데 Object클래스는 모든 클래스의 조상이므로
    이 메서드의 매개변수로 어떤 타입의 인스턴스도 가능하므로, 이 하나의 메서드로 모든 타입의 인스턴스를 처리할 수 있는 것이다.
    이 메서드는 매개변수에 toString() 을 호출하여 문자열을 얻어서 출력한다.

 */
class Product3{
    int price; // 제품의 가격
    int bonusPoint;  // 제품구매 시 제공하는 보너스 점수

    Product3(int price) {
        this.price = price;
        bonusPoint = (int)(price/10.0); // 보너스저무는 제품의 10%
    }
}

class Tv3 extends Product3{
    Tv3(){
        super(100);
    }
    public String toString(){return "Tv3";}
}

class Computer3 extends Product3{
    Computer3(){ super(200);}
    public String toString() {return "Computer";}
}



class Audio3 extends Product3{
    Audio3(){
        super(50);
    }
    public String toString(){
        return "Audio3";
    }
}

class Buyer3{
    int money = 1000;
    int bonusPoint = 0;

    void buy(Product3 p){
        if( money < p.price){
            System.out.println("잔액이 부족합니다.");
            return;
        }

        money -= p.price; // 가진 돈에서 구입한 제품의 가격을 뺀다.
        bonusPoint += p.bonusPoint; // 보너스 보인트 점수를 추가
        System.out.println(p + "을/를 구매하셨습니다.");
    }
}

public class PolyArgumentTest {
    public static void main(String[] args) {
        Buyer3 b = new Buyer3();
        b.buy(new Tv3()); // Tv3 t = new Tv3()  + b.buy(t) 와 같은 것이다.
        b.buy(new Computer3());
        b.buy(new Audio3());

        System.out.println("남은돈 :" + b.money);
        System.out.println("보너스점수 :" + b.bonusPoint);
    }
}
