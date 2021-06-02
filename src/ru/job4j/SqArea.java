package ru.job4j;

public class SqArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        return l * h;

    }

    public static double square2(double p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        return l * h;

    }

    public static double square3(double p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        return l * h;

    }

    public static void main(String[] args) {
        double result = SqArea.square(6, 2);
        double result2 = SqArea.square2(7, 3);
        double result3 = SqArea.square3(12, 3);
        System.out.println(" p = 6, k = 2, s = 1, real = " + result);
        System.out.println(" p = 7, k = 3, s = 1, real = " + result2);
        System.out.println(" p = 12, k = 3, s = 1, real = " + result3);
    }
}
