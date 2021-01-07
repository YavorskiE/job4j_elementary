package ru.job4j.condition;

public class AlertDivByZero {
    public static void main(String[] args) {
        negativeMessage(4);
        negativeMessage(-2);
    }

    public static void negativeMessage(int number) {
        if (number < 0) {
            System.out.println(number + " - This is negative number");
        }
    }
}
