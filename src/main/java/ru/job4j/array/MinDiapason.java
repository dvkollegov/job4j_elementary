package ru.job4j.array;

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int j = start + 1; j <= finish; j++) {
            if (array[j] < min) {
                min = array[j];
            }
        }
        return min;
    }
}
