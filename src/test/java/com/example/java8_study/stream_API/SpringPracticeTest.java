package com.example.java8_study.stream_API;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class SpringPracticeTest {

    private final SpringPractice answer = new SpringPractice();
    @Test
    void quiz1(){
        Assertions.assertThat(quiz1()).isEqualTo(answer.quiz1());
    }

}