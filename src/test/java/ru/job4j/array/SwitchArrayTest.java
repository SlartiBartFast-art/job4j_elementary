package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class SwitchArrayTest {

    @Test
    public void whenSwap1to3() {
        int[] input = {4, 5, 6, 7};
        int[] expect = {4, 7, 6, 5};
        int[] rsl = SwitchArray.swap(input, 1, input.length - 1);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {4, 2, 3, 1};
        int[] rsl = SwitchArray.swap(input, 0, input.length - 1);
        assertThat(rsl, is(expect));
    }
    @Test
    public void whenSwap1To2() {
        int[] input = {4, 5, 6, 7};
        int[] expect = {4, 6, 5, 7};
        int[] rsl = SwitchArray.swap(input, 1, 2);
        assertThat(rsl, is(expect));
    }
}