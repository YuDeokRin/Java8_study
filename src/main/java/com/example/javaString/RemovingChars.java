package com.example.javaString;

public class RemovingChars {
    public static void main(String[] args) {

        String str = "Did you go there? We did, but we had a \"great\" service there.";

        String[] parts = str.split(" "); // 문자열을 " "구분해서  문자열로 짜른다. 그래서 문자열 배열을 만드는 것이다.


        for (String part : parts) { // for문으로 문자열 배열을 하나씩 part문자열을 반복문을 회전한다.
            String word = removeChars(part); //  removeChars()함수를 호출한다.
            System.out.println(word);  // 출력

        }

    }

    private static String removeChars(String part) {

        String word = part; // 매개변수 part - type : String

        // 조건문: 받은 문자열에서 ".", "?", ",", "\" 중 하나의 조건을 만족하면 ...
        if (part.endsWith(".") || part.endsWith("?") || part.endsWith(",") || part.endsWith("\"")) {
            word = part.substring(0, part.length() - 1); // part를 substring한다. 0부터 문자열길이 -1까지
        }

        if(part.startsWith("\"")){ // 시작을 \로 시작한다면..
            word = part.substring(1, part.length() - 1); // 1부터 짜른다.
        }

        return word;
    }
}
