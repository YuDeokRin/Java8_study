package com.example.AnnotationEx;

import java.util.Arrays;

@Chicken("양념")
@Chicken("마늘간장")
public class AnnotaionEx1 {


    public static void main(String[] args) {

        // 배열로 온걸 출력해보기
        /*
        Chicken[] chicken = AnnotaionEx1.class.getAnnotationsByType(Chicken.class);
        Arrays.stream(chicken).forEach(c ->  {
            System.out.println(c.value());
        });
         */


        // 컨테이너타입으로 가져오기
        ChickenContainer chickenContainer = AnnotaionEx1.class.getAnnotation(ChickenContainer.class);
        Arrays.stream(chickenContainer.value()).forEach(c -> {
            System.out.println(c.value());
        });
    }
}
