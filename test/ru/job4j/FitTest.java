package ru.job4j;

import org.junit.Test;

import org.junit.Assert;

public class FitTest {

    @Test
    public void whenMan193Then106() {
        short in = 193;
        double expected = 106;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 1);
    }

    @Test
    public void whenWoman168Then66() {
        short in = 168;
        double expected = 66;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 1);
    }
}