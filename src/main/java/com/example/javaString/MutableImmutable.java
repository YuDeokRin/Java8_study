package com.example.javaString;
/*
    Java mutable & immutable strings

    The String is a sequence of immutable characters, while the StringBuilder is a sequence of mutable characters.
     The next example will show the difference.
 */
public class MutableImmutable {
    public static void main(String[] args) {

        String name = "Jane";
        String Id = "010-1111-1434";
        String Id2 = Id.replace('4', '5');
        System.out.println(Id2);

        //J -> K로 변경
        String name2 = name.replace('J', 'K');
        String name3 = name2.replace('n', 't');

        System.out.println(name);
        System.out.println(name3);

        //StringBuilder로
        StringBuilder sb = new StringBuilder("Jane");
        System.out.println(sb);

        sb.setCharAt(0, 'K'); // char 분리했을 때 0번째 문자를 'K'로 변경
        sb.setCharAt(2, 't'); // char 분리했을 때 2번째 문자를 't'로 변경

        System.out.println(sb);

    }
}
