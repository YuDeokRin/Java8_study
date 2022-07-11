package com.example.javaString;
/*
    Match() 메소드는 문자열이 주어진 정규표현식과 일치하는지 여부를 알려준다.
 */
public class StringMatch {
    public static void main(String[] args) {
        var words = "book\nbookshelf\nbookworm\nbookcase\nbookish\nbookkeeper\nbooklet\nbookmark";

        var wstream = words.lines(); //stream으로 만든다 ?

        wstream.forEach(word -> {
            if (word.matches("book(worm|mark|keeper)?")) {
                System.out.println(word);
            }
        });
    }
}
