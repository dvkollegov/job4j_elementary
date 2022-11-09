package ru.job4j.ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        double result1 = Point.distance(5, 4, 10, 16);
        double result2 = Point.distance(10, 8, 30, 28);
        double result3 = Point.distance(23, 14, 46, 114);
        System.out.println("result (0, 0) to (2, 0) " + result);
        System.out.println("result1 (5, 4) to (10, 16) " + result1);
        System.out.println("result2 (10, 8) to (30, 28) " + result2);
        System.out.println("result3 (23, 14) to (46, 114) " + result3);
    }
}
