package com.example.java8_study;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class StiringTest {

    @Test
    void replace(){
        String actual = "abc".replace("b", "d");
        Assertions.assertThat(actual).isEqualTo("abc");
    }
}


