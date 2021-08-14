package ru.job4j;

public class Counter {
    public static int sum(int start, int finish) {
        int sum;
        for (sum = 0;  sum <= 10; sum++) {
            sum = sum + (start + finish);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));
    }
}
