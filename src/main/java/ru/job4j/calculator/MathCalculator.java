package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double subAndDivide(double first, double second) {
        return difference(first, second) + divide(first, second);
    }

    public static double fourOperations(double first, double second) {
        return sum(first, second) + multiply(first, second) +
                difference(first, second) + divide(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчёта равен: " +  sumAndMultiply(10, 20));
        System.out.println("Результат расчёта разницы и деления равен: " +  subAndDivide(10, 20));
        System.out.println("Результат расчёта четырёх операций равен: " +  fourOperations(10, 20));
    }
}
