package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when1115to2024Then12() {
        double expected = 12.72;
       /* int x1 = 11;
        int y1 = 15;
        int x2 = 20;
        int y2 = 24;*/
        Point a = new Point(11, 15);
        Point b = new Point(20, 24);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void when817to1824Then12() {
        double expected = 12.20;
        /*int x1 = 8;
        int y1 = 17;
        int x2 = 18;
        int y2 = 24;*/
        Point a = new Point(8, 17);
        Point b = new Point(18, 24);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void when2129to2431Then3() {
        double expected  = 3.60;
        /*int x1  = 21;
        int y1 = 29;
        int x2 = 24;
        int y2 = 31;*/
        Point a = new Point(21, 29);
        Point b = new Point(24, 31);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void when212931to243133Then4() {
        double expected  = 4.12;
        /*int x1  = 21;
        int y1 = 29;
        int x2 = 24;
        int y2 = 31;*/
        Point a = new Point(21, 29, 31);
        Point b = new Point(24, 31, 33);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void when81731to182433Then12() {
        double expected  = 12.36;
        /*int x1  = 21;
        int y1 = 29;
        int x2 = 24;
        int y2 = 31;*/
        Point a = new Point(8, 17, 31);
        Point b = new Point(18, 24, 33);

        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}