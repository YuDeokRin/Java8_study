package com.example.lambdaEx;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.*;

public class LambdaEx003 {
    public static void main(String[] args) {

    List<String> list = Arrays.asList("1", "2", "4","6","7", "3","9");
    Collections.sort(list, new Comparator<>(){
       public int compare(String s1, String s2){
            return s2.compareTo(s1);
        }
    });
        System.out.println(list);

        List<String> list2 = Arrays.asList("asddwd", "aa", "abc","z","y", "b","c");
        Collections.sort(list, (s1, s2) -> s2.compareTo(s1));
        System.out.println(list2);


    }
}
