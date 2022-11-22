package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point point1 = new Point(0, 0);
        Point point2 = new Point(2, 0);
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when54to1016then13() {
        double expected = 13;
        Point point1 = new Point(5, 4);
        Point point2 = new Point(10, 16);
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when108to3028then28dot28() {
        double expected = 28.28;
        Point point1 = new Point(10, 8);
        Point point2 = new Point(30, 28);
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when2314to46114then102dot61() {
        double expected = 102.61;
        Point point1 = new Point(23, 14);
        Point point2 = new Point(46, 114);
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }
}