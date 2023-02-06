package com.example.stackEx;

import java.util.Stack;
/*
    웹브라우저의 '뒤로' '앞으로' 버튼의 기능 구현
 */

public class 웹브라우저_앞뒤 {
    public static Stack back = new Stack();
    public static Stack forward = new Stack();

    public static void main(String[] args) {
        goURL("1.네이트");
        goURL("2.야후");
        goURL("3.네이버");
        goURL("4.다음");

        printStatus(); // 현재 '다음'

        goBack();
        System.out.println("= 뒤로가기 버튼을 누른다 후 =");
        printStatus(); // 현재 '네이버

        goBack();
        System.out.println("= '뒤로'  버튼을 누른다 후 =");
        printStatus(); // 현재 야후

        goForward();
        System.out.println("= '앞으로'  버튼을 누른다 후 =");
        printStatus(); // 현재 네이버

        goURL("codechobo.com");
        System.out.println("= 새로운 주소로 이동 후  =");
        printStatus();

    }

    public static void printStatus() {
        System.out.println("back :" + back);
        System.out.println("forward:" + forward);
        System.out.println("현재화면은 '" + back.peek() + "' 입니다.");
        System.out.println();
    }


    public static void goURL(String url) {
        back.push(url);
        if(!forward.empty()){
            forward.clear();
        }
    }

    public static void goForward(){
        if(!forward.empty()){
            back.push(forward.pop());
        }
    }

    public static void goBack(){
        if (!back.empty()) {
            forward.push(back.pop());
        }
    }
}
