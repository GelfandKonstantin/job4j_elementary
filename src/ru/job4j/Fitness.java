package ru.job4j;

public class Fitness {
    public static int calc(int ivan, int nik) {
        int month = 0;
        while (ivan > nik) {
            ivan = ivan * 3;
            month += 0;
        }
        return month;
    }
}
