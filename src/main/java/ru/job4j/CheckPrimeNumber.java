package ru.job4j;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        // Исключаем из выборки 1, так как 1 не является целым числом
        boolean prime = number > 1;
        for (int index = 2; index < number; index++) {
            if (number % index == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}

