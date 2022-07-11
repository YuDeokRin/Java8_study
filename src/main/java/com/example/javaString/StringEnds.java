package com.example.javaString;

public class StringEnds {
    public static void main(String[] args) {

        var words = "club\nsky\nblue\ncup\ncoin\nnew\ncent\nowl\nfalcon\nwar\nice";

        var wstream = words.lines();
        wstream.forEach(word -> {
            if (word.endsWith("n") || word.endsWith("y")) { //단어가 끝나는 부분에 n 또는 y가 나오는거
                System.out.println(word);
            }
        });
    }
}
