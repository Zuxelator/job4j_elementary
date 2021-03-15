package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class SqAreaTest {

    @Test
    public void whenP12K3Then() {
        int p = 12;
        int k = 2;
        double expected = 8;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP18K2Then18() {
        int p = 18;
        int k = 2;
        double expected = 18;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP40K4Then64() {
        int p = 40;
        int k = 4;
        double expected = 64;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}