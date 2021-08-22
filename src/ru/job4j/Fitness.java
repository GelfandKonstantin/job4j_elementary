package ru.job4j;

public class Fitness {
    public static int calc(int ivan, int nik) {
        int month = 0;
        while (month < 0) {
            month = ivan * 2;
            month += 2;
            System.out.println(month);
            month = nik * 3;
            month += 3;
            System.out.println(month);
        }
        return month;
    }
}
