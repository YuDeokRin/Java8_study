package com.example.javaString;

public class StringInt {
    public static void main(String[] args) {

        //String

        char[] cdb = {'M', 'y', 's', 'q', 'l'};

        String lang = "Hello"; // 가장 기본
        String ide = new String("Java");
        String db = new String(cdb);

        System.out.println(lang);
        System.out.println(ide);
        System.out.println(db);

        System.out.println("------ ");
        StringBuilder sb = new StringBuilder(lang); //A StringBuilder Object is created from a String.
        System.out.println(sb);

        StringBuilder sb2 = new StringBuilder(); //create an empty StringBuilder object.
        sb2.append("Fields"); // append three string into the object
        sb2.append(" of ");
        sb2.append(" glory");

        System.out.println(sb2);

    }
}
