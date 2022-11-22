package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax2To1Then2() {
        int left = 2;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax2To2Then2() {
        int left = 2;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void thirdMax() {
        int a = 2;
        int b = 3;
        int c = 5;
        int result = Max.max(a, b, c);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void fourthMax() {
        int a = 2;
        int b = 3;
        int c = 4;
        int d = 5;
        int result = Max.max(a, b, c, d);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }
}