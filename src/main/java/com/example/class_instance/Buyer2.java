package com.example.class_instance;


public class Buyer2 {
    int money = 1000;
    int bonusPoint = 0;


    void buy(Product p) {
        money -= p.price;
        bonusPoint += p.bonusPoint;
    }

}
