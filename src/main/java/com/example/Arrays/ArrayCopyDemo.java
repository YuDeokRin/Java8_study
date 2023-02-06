package com.example.Arrays;

/*
       public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
 */

public class ArrayCopyDemo {
    public static void main(String[] args){
        String[] copyFrom = {
                "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
                "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
                "Marocchino", "Ristretto" };
        String[] copyTo = new String[7];
        System.arraycopy(copyFrom, 2, copyTo, 0, 7); // copyFrom 변수에서 , 인덱스번호 2번부터,  ??, 길이:  7개 (2 ~ 8)
        for (String coffee : copyTo) {
            System.out.print(coffee + " ");
        }

        // -------Array Manipulations-------
        System.out.println();
        System.out.println("-------Array Manipulations-------");
        String[] copyTo1 = java.util.Arrays.copyOfRange(copyFrom, 2, 9); // copyFrom변수에서 , 인덱스 2번 부터, 9번까지 복사해서 copyTo1에 넣는다.
        for (String coffee1 : copyTo1) {
            System.out.print(coffee1 + " ");
        }

        //-------Stream을 활용---------
        System.out.println();
        System.out.println("-------Stream을 활용---------");
        java.util.Arrays.stream(copyTo1)
                .map(coffee -> coffee + " ")
                .forEach(System.out::print);

        //-------toString------------
        System.out.println();
        System.out.println("-------toString------------");
        System.out.println(java.util.Arrays.toString(copyTo));

    }

}
