package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int j, temp;
        for (int i = 0; i < array.length / 2; i++) {
            j = array.length - i - 1;
            temp = array[i];
            array[i] = array[j];
            array[j] =  temp;
        }
        return array;
    }
}
