package com.example.javaString;

/*
    Java concatenating strings

 */
public class ConcatenateStrings {
    public static void main(String[] args) {
        System.out.println("Return" + " of " + "the king.");
        System.out.println("Return".concat(" of ").concat("the king."));

        StringBuilder sb = new StringBuilder();
        sb.append("Retrun");
        sb.append(" of ");
        sb.append("the king.");

        System.out.println(sb);
    }
}
