package com.example;

import java.util.Iterator;
import java.util.Stack;

public class collections {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.add("Geeks");
        stack.add("For");
        stack.add("Geeks");
        stack.add("Geesk");

        Iterator<String> itr = stack.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next() + " ");
        }

        
    }
}
