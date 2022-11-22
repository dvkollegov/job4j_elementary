package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {
    private int x;
    private int y;
    private int z;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public double distance3d(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2) + pow(this.z - that.z, 2));
    }

    public static void main(String[] args) {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(2, 0);
        Point point3 = new Point(10, 8);
        Point point4 = new Point(30, 28);
        Point point5 = new Point(10, 5, 12);
        Point point6 = new Point(15, 3, 24);
        System.out.println(point1.distance(point2));
        System.out.println(point3.distance(point4));
        System.out.println(point5.distance(point6));
    }
}
