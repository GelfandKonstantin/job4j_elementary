package ru.job4j;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int n = 5;
        int i = 1;
        int result = Counter.sumByEven(n, i);
        int expected = 120;
        Assert.assertEquals(expected, result);
        /* напишите здесь тест, проверяющий, что факториал для числа 5 равен 120. */
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int n = 0;
        int i = 1;
        int result = Counter.sumByEven(n, i);
        int expected = 1;
        Assert.assertEquals(expected, result);
        /* напишите здесь тест, проверяющий, что факториал для числа 0 равен 1. */
    }
}