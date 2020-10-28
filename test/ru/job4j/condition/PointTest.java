package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class PointTest {

    @Test
    public void when1115to2024Then12() {
        double expected = 12.72;
        int x1 = 11;
        int y1 = 15;
        int x2 = 20;
        int y2 = 24;
        double out = Point.distance(11, 15, 20, 24);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void when817to1824Then12() {
        double expected = 12.20;
        int x1 = 8;
        int y1 = 17;
        int x2 = 18;
        int y2 = 24;
        double out = Point.distance(8, 17, 18, 24);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void when2129to2431Then3() {
        double expected  = 3.60;
        int x1  = 21;
        int y1 = 29;
        int x2 = 24;
        int y2 = 31;
        double out = Point.distance(21, 29, 24, 31);
        Assert.assertEquals(expected, out, 0.01);
    }
}