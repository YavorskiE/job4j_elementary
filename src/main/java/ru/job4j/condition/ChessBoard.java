package ru.job4j.condition;

public class ChessBoard {

    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = Math.abs(x2 - x1);
        return rsl != Math.abs(y2 - y1) || out(x1) || out(y1) || out(x2) || out(y2) ? 0 : rsl;
    }

    public static boolean out(int xy) {
        return xy < 0 || xy > 7;
    }
}
