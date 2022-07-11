package com.example.javaString;

public class Splitting {
    public static void main(String[] args) {
        String s = "To Day is this beautiful day";

        String[] words = s.split(" ");

        for (String word : words) {
            System.out.println(word);
        }
    }
}
