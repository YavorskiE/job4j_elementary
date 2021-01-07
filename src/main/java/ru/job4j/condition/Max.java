package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left >= right ?  left : right;
    }

    public static int max(int first, int second, int third) {
        return Max.max(Max.max(first, second), third);
    }

    public static int max(int first, int second, int third, int fourth) {
        return Max.max(Max.max(first, second, third), fourth);
    }

    public static void main(String[] args) {
        int rsl = max(10, 9);
        System.out.println(rsl);
        System.out.println(max(9, 10, 11, 12));
    }
}
