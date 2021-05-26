package ru.job4j.condition;

public class ChessBoard {

    public static int way(int x1, int y1, int x2, int y2) {
        if (out(x1) || out(y1) || out(x2) || out(y2)) {
            return 0;
        }
        int rsl = Math.abs(x2 - x1);
        if (rsl != Math.abs(y2 - y1)) {
            return 0;
        }
        return rsl;
    }

    private static boolean out(int xy) {
        return xy < 0 || xy > 7;
    }
}
