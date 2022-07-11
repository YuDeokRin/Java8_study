package com.example.javaString;

public class Substrings {
    public static void main(String[] args) {

        String str = "bookcase";

        System.out.println(str.substring(0, 4));
        System.out.println(str.substring(4, str.length()));


        String str2 = "대한이2 민국이";

        System.out.println(str2.substring(0,4));
        System.out.println(str2.substring(5, str.length()));
    }
}
