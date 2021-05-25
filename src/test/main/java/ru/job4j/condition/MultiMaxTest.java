package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;

public class MultiMaxTest {

    @Test
    public void wnen9And10And9ThenMax10() {
        int result = MultiMax.max(9, 10, 9);
        Assert.assertThat(result, is(10));
    }

    @Test
    public void wnen11And10And9ThenMax11() {
        int result = MultiMax.max(11, 10, 9);
        Assert.assertThat(result, is(11));
    }

    @Test
    public void wnen9And10And12ThenMax12() {
        int result = MultiMax.max(9, 10, 12);
        Assert.assertThat(result, is(12));
    }

    @Test
        public void wnen10And10And10ThenMax10() {
        int result = MultiMax.max(10, 10, 10);
        Assert.assertThat(result, is(10));
    }
}