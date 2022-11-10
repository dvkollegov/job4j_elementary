package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when54to1016then13() {
        double expected = 13;
        int x1 = 5;
        int y1 = 4;
        int x2 = 10;
        int y2 = 16;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when108to3028then28dot28() {
        double expected = 28.28;
        int x1 = 10;
        int y1 = 8;
        int x2 = 30;
        int y2 = 28;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when2314to46114then102dot61() {
        double expected = 102.61;
        int x1 = 23;
        int y1 = 14;
        int x2 = 46;
        int y2 = 114;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}