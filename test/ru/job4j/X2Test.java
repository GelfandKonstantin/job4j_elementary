package ru.job4j;

import org.junit.Test;

import org.junit.Assert;

public class X2Test {

    @Test
    public void whenA10B0C0X2Then40() {
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 2;
        int expected = 40;
        int rsl = X2.calc(a, b, c, x);
        a = 1;
        b = 1;
        c = 1;
        x = 1;
        int expected2 = 3;
        int rsl2 = X2.calc(a, b, c, x);
        a = 0;
        b = 1;
        c = 1;
        x = 1;
        int expected3 = 2;
        int rsl3 = X2.calc(a, b, c, x);
        a = 1;
        b = 1;
        c = 0;
        x = 1;
        int expected4 = 2;
        int rsl4 = X2.calc(a, b, c, x);
        a = 1;
        b = 1;
        c = 1;
        x = 0;
        int expected5 = 1;
        int rsl5 = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, rsl);
        Assert.assertEquals(expected2, rsl2);
        Assert.assertEquals(expected3, rsl3);
        Assert.assertEquals(expected4, rsl4);
        Assert.assertEquals(expected5, rsl5);
    }
    }
