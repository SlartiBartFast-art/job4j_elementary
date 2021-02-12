package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int rsl = Factorial.calc(5);
        int expected = 120;
        assertThat(rsl, is(expected));
    }
    @Test
    public void whenCalculateFactorialForTreeThenSix() {
        int rsl = Factorial.calc(3);
        int expected = 6;
        assertThat(rsl, is(expected));
    }
    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int rsl = Factorial.calc(0);
        int expected = 1;
        assertThat(rsl, is(expected));
    }
}