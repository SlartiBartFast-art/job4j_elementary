package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int rsl = Counter.sumByEver(1, 10);
        int expected = 30;
        assertThat(rsl, is(expected));
    }
    @Test
    public void whenSumEvenNumbersFromFiveToFiftyThenFifteen() {
        int rsl = Counter.sumByEver(5, 15);
        int expected = 50;
        assertThat(rsl, is(expected));
    }
}