package com.example.javaString;

public class Stringstarts {
    public static void main(String[] args) {

        var words = "club\nsky\nblue\ncup\ncoin\nnew\ncent\nowl\nfalcon\nwar\nice";



        var wstream = words.lines();

        // 문자열 안에 있는 단어 중 c로 시작하는 모든 단어는 출력한다.
        wstream.forEach(word -> {
            if (word.startsWith("c")) {
                System.out.println(word);
            }
        });
    }
}
