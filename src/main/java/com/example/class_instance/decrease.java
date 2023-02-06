package com.example.class_instance;

import java.util.Scanner;

public class decrease {

    public  int re(int n){
        int result = 0;

        if( n ==1) result = 1;
        else
            result = n * re(n-1) ;
        return result;


    }
    public static void main(String[] args) {
        decrease T = new decrease();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(T.re(n));

    }
}
