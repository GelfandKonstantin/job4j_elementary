package ru.job4j;

public class MathFunc {
    public static int func1(int x) {
        int y = x * x + 1;
        int result = y;
        return result;
    }

    public static void main(String[] args) {
        int result = MathFunc.func1(100);
        System.out.println(result);
    }
}
