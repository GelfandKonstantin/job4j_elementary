package ru.job4j;

public class DivideBySix {
    public static String checkNumber(int number) {
        String rsl;
        if (number % 3 == 0) {
            if (number % 2 == 0) {
                rsl = "Исходное число делится на 6.";
            } else {
                rsl = "Исходное число не делится на 6.";
            }
            return rsl;
        }
        return null;

        else {
            if (number % 3 != 0) {
                rsl = "Исходное число делится на 3, но не является четным.";
            }
            return rsl;
        }

    }
}


