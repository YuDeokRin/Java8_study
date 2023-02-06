package com.example.class_instance;

public class Product {
    int price; // 제품의 가격
    int bonusPoint; // 제품구매 시 제공하는 보너스점수
}

class TV extends Product {}
class Computer extends Product{}
class Audio extends Product{}

class Buyer{ // 고객, 물건을 사는사람
    int money = 1000; // 소유 금액
    int bonusPoint = 0; // 보너스 점수

    void buy(TV t){
        // Buyer가 진 돈에서 제품의 가격만큼뺀다.
        money= money - t.price;

        //구매자의 보너스점수에 제품의 보너스점수를 더한다.
        bonusPoint += t.bonusPoint;
    }

    void buy(Computer c) {
        money = money - c.price;
        bonusPoint += c.bonusPoint;
    }

    void buy(Audio a){
        money -= a.price;
        bonusPoint += a.bonusPoint;
    }
}
