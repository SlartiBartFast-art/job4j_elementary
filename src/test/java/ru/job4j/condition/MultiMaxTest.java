package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MultiMaxTest {

    @Test
    public void whenExampleMax() {
        int result = MultiMax.max(1, 4, 2);
        assertThat(result, is(4));
    }
    @Test
    public void whenFirstMax() {
        int result = MultiMax.max(9, 7, 5);
        assertThat(result, is(9));
    }

    @Test
    public void whenThirdMax() {
        int result = MultiMax.max(5, 3, 9);
        assertThat(result, is(9));
    }

    @Test
    public void whenAllEqually() {
        int result = MultiMax.max(5, 5, 5);
        assertThat(result, is(5));
    }

    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(2, 9, 7);
        assertThat(result, is(9));
    }
}