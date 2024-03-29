package com.example.java8_study;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.*;

public class SetTest {
    private Set<Integer> numbers;


    @BeforeEach
    void setUp(){
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    //요구사항 1
    //Set의 size() 메소드를 활용해 Set의 크기를 확인하는 학습테스트를 구현한다.

    //Test 구현

    @Test
    void contains() {
        assertThat(numbers.contains(1)).isTrue();
        assertThat(numbers.contains(2)).isTrue();
        assertThat(numbers.contains(3)).isTrue();

    }
}
