package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        double s = l * h;
        return s;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
        double result2 = SqArea.square(8, 4);
        System.out.println(" p = 8, k = 4, s = 2.56, real = " + result2);
        double result3 = SqArea.square(25, 5);
        System.out.println(" p = 25, k = 5, s = 21.70, real = " + result3);
    }
}
