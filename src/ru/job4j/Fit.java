package ru.job4j;

public class Fit {
    public static double manWeight(short height) {
        return (height - 100) * 1.15;

    }

    public static double womanWeight(short height) {
        return (height - 110) * 1.15;

    }

    public static void main(String[] args) {
        short height = 193;
        double man = Fit.manWeight(height);
        double woman = Fit.womanWeight(height);
        System.out.println("Man 193 is " + man);
        System.out.println("Woman 193 is " + woman);
    }
}
