package com.example.lambdaEx;

import java.util.Arrays;

public class LambdaEx001 {
    public static int max(int a, int b){
        return a > b ? a : b;
    }



    public static void main(String[] args) {
        int[] arr = new int[5];
        Arrays.setAll(arr, (i) -> (int) (Math.random() * 45) + 1);
//        for(int i = 0; i< arr.length; i++){
//            System.out.println(arr[i]);
//        }

        System.out.println(max(3, 4));





    }
}
