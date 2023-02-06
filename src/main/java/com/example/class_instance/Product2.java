package com.example.class_instance;

/*
    매개변수가 Product타입의 참조변수라는 것은, 메서드의 매개변수로 Product클래스의 자손타입의 참조변수면 어느 것이나
    매개변수로 받아들일 수 있다는 뜻이다.
    그리고 Product클래스에 price와 bonusPoint가 선언되어 있기 때문에 참조변수 p로 인스턴스의 price와 bonusPoint를
    사용할 수 있기에 이와 같이 할 수 있다.

    앞으로 다른 제품 클래스를 추가할 때 Product클래스를 상속받기만 하면,  buy(Product p)메서드의 매개변수로 받아들여질 수 있다.

    Buyer b = new Buyer();
    Tv t = new Tv();

    b.buy(new Tv()); ->  Tv t = new Tv(), b.buy(t);
    c.buy(new Computer(); -> Computer c = new Computer(), b.buy(c);

    Computer c = new Computer();
    b.buy(t);
    b.buy(c);
 */

class Tv2 extends Product {}
class Computer2 extends Product{}
class Audio2 extends Product{}

public class Product2 {
    int price;
    int bonusPoint;
}


