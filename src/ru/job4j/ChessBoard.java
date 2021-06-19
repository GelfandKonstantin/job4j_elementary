package ru.job4j;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (x1 >= 0 && x1 <= 7) {
            rsl = Math.abs(x2 - x1);
        } else if (x1 >= 0 && x1 <= 6) {
            rsl = Math.abs(x2 - x1);
        } else if (x1 >= 1 && x1 <= 5) {
            rsl = Math.abs(x2 - x1);
        } else if (x1 >= 2 && x1 <= 4) {
            rsl = Math.abs(x2 - x1);
        } else if (x1 >= 3 && x1 <= 3) {
            rsl = Math.abs(x2 - x1);
        } else if (x1 >= 4 && x1 <= 2) {
            rsl = Math.abs(x2 - x1);
        } else if (x1 >= 5 && x1 <= 1) {
            rsl = Math.abs(x2 - x1);
        } else if (x1 >= 6 && x1 <= 0) {
            rsl = Math.abs(x2 - x1);
        }
        return rsl;
        if (Math.abs(x2 - x1) == Math.abs(y2 - y1)) {
            ????
        }
        return rsl;
    }
}
