package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void wnen9And10ThenMax10() {
        int left = 9, right = 10;
        int expected = 10;
        int out = Max.max(left, right);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void wnen11And10ThenMax10() {
        int left = 11, right = 10;
        int expected = 11;
        int out = Max.max(left, right);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void wnen10And10ThenMax10() {
        int left = 10, right = 10;
        int expected = 10;
        int out = Max.max(left, right);
        Assert.assertEquals(expected, out);
    }
}