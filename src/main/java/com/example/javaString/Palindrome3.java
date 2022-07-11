package com.example.javaString;

public class Palindrome3 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("radar"));
        System.out.println(isPalindrome("kayak"));
        System.out.println(isPalindrome("forest"));
    }

    private static boolean isPalindrome(String original) {


        char[] data = original.toCharArray(); // 문자열(original)을 char 형으로 바꿔준다. 즉 문자배열로 바꿔준다.

        int i = 0; // i는 인덱스를 설정하기 위해서 만들어줌
        int j = data.length - 1; //

        while( j > i){ // j가 i보다 크면 참 ,
            if (data[i] != data[j]) {
                return false;
            }

            ++i; // 다음 인덱스로 넘어간다. -> 0 , 1 , 2 ,3 ...
            --j; // 맨 뒤에 인덱스부터 앞으로 간다. 그래서 마이너스하는 것  -> 4 , 3, 2, 1

        }
        return true;
    }
}
