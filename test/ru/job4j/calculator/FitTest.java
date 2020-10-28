package ru.job4j.calculator;

import org.junit.Test;
import org.junit.Assert;

public class FitTest {

    @Test
    public void when1Man180Then92() {
        short in = 180;
        double expected = 92;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void whenWoman187Then100() {
        short in = 187;
        double expected = 100.05;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);


    }

    @Test
    public void whenMan180Then100() {
        short in = 187;
        double expected = 100.05;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}