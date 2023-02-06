package com.example.java8_study.stream_API;

import java.util.Arrays;
import java.util.Scanner;

public class StreamEx002 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[][] arr = new int[N][2];

        for (int i = 0; i < N; i++) {
            arr[i][0] = in.nextInt();
            arr[i][1] = in.nextInt();
        }



        Arrays.sort(arr, (o1, o2) -> {
            if (o1[0] == o2[0]) return o1[1] - o2[1];
            else return o1[0] - o2[0];
        });

        for (int i = 0; i < N; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }

    }
}
