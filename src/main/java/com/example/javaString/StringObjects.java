package com.example.javaString;

public class StringObjects {
    public static void main(String[] args) {
        String lang = "Java"; //An object of String type is created

        String bclass = lang.getClass().toString();

        System.out.println(bclass); //class java.lang.String

        String sup = lang.getClass().getSuperclass().toString(); // A parnet class of our object is received. All objects have at least one parent - the Object
        System.out.println(sup); //  class java.lang.Object

        if (lang.isEmpty()) {
            System.out.println("The String is empty");
        }else{
            System.out.println("The string is not empty");
        }

        int l = lang.length();
        System.out.println("The string has " + l + " characters");

    }
}
