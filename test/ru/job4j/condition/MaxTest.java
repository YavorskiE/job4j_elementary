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

    @Test
    public void when10And10And11() {
        int  first = 10, second = 10, third = 11;
        int expected = 11;
        int out = Max.max(first, second, third);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void when10And12And10() {
        int  first = 10, second = 12, third = 10;
        int expected = 12;
        int out = Max.max(first, second, third);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void when10And9And9() {
        int  first = 10, second = 9, third = 9;
        int expected = 10;
        int out = Max.max(first, second, third);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void when10And9And9and9() {
        int  first = 10, second = 9, third = 9, fourth = 9;
        int expected = 10;
        int out = Max.max(first, second, third, fourth);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void when9And10And11and12() {
        int  first = 9, second = 10, third = 11, fourth = 12;
        int expected = 12;
        int out = Max.max(first, second, third, fourth);
        Assert.assertEquals(expected, out);
    }
}