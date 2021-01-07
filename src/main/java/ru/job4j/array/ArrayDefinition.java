package ru.job4j.array;

public class ArrayDefinition {

    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100501];
        float[] prices = new float[40];
        String[] names = new String[4];

        names[0] = "Petr Arsentev";
        names[1] = "Yevgeniy";
        names[2] = "Yavorsky";
        names[3] = "Яворский";

        for (int i = 0; i < 4; i++) {
            System.out.println(names[i]);
        }
    }
}
