package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

//import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void whenPoint02ThenDistance2Test() {
        int x1 = 0, y1 = 0;
        int x2 = 2, y2 = 0;
        double expected = 2.0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}