package com.example.java8_study.etc;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class 배열_병렬_정렬 {
    public static void main(String[] args) {
        int size = 100;
        int[] numbers = new int[size];

        Random random = new Random();
        IntStream.range(0, size).forEach(i -> numbers[i] = random.nextInt());

        long start = System.nanoTime();
        Arrays.sort(numbers);
        // The sorting algorithm is a Dual-Pivot Quicksort by Vladimir Yaroslavskiy,
        // Jon Bentley, and Joshua Bloch. This algorithm offers O(n log(n)) performance on many data sets that cause other quicksorts to degrade to quadratic performance,
        // and is typically faster than traditional (one-pivot) Quicksort implementations.
        System.out.println("serial sorting took :" + (System.nanoTime() - start));

        IntStream.range(0,size).forEach(i ->numbers[i] = random.nextInt());
        start = System.nanoTime();
        Arrays.parallelSort(numbers);
        System.out.println("parallel sorting took :" + (System.nanoTime() - start));

    }
}
