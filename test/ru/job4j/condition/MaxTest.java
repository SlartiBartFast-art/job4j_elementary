package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class MaxTest {

    @Test
    public void when14To27Then27() {
        int result = Max.max(14, 27);
        assertThat(result, is(27));
    }

    @Test
    public void when27To14Then27() {
        int result = Max.max(27, 14);
        assertThat(result, is(27));
    }
    @Test
    public void when14To14Then14() {
        int result = Max.max(14, 14);
        assertThat(result, is(14));
    }
}