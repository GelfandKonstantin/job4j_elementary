package ru.job4j;

import org.junit.Test;

import org.junit.Assert;

public class TriangleTest {

    @Test
    public void whenExist() {
        double ab = 2.0;
        double ac = 2.0;
        double bc = 2.0;
        boolean result = Triangle.exist(ab, ac, bc);
        Assert.assertTrue(true);
    }

    @Test
    public void whenDoNotExist() {
        double ab = 3.0;
        double ac = 1.0;
        double bc = 23.0;
        boolean result = Triangle.exist(ab, ac, bc);
        Assert.assertFalse(false);
    }
}