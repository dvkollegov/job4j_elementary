package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        /*
        Теперь запишем все формулы, необходимые для вычисления.
        h = p / (2 * (k + 1));
        l = h * k;
        s = l * h;
        */
        double h = p / (2 * (k + 1));
        double l = h * k;
        double s = l * h;
        return s;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
    }
}
