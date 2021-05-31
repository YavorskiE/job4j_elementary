package ru.job4j;

public class ToPlay {
    public static void main(String[] args) {
        String[] numbers = {"one", "two", "three", "four", "five"};
        for (int i =0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        for (String number : numbers) {
            System.out.println(number);
        }
    }
}
