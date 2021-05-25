package ru.job4j.condition;

public class Club {

    public static void condition(boolean hasMoney, boolean beFriend) {
        if (hasMoney || beFriend) {
            System.out.println("I can go to the club.");
        } else {
            System.out.println("I can't");
        }
    }

    public static void main(String[] args) {
        condition(true, true);
        condition(true, false);
        condition(false, true);
        condition(false, false);
    }
}
