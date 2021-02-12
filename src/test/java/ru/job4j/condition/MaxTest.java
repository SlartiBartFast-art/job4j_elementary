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
    @Test
    public void when25To14and19Then25() {
        int result  = Max.max(25, 14, 19);
        assertThat(result, is(25));
    }
    @Test
    public void when19To25and14Then25() {
        int result = Max.max(19, 25, 14);
        assertThat(result, is(25));
    }
    @Test
    public void  when19To15and17and18Then19() {
        int result = Max.max(19, 15, 17, 18);
        assertThat(result, is(19));
    }
    @Test
    public void when14To15and17and18Then18() {
        int result  = Max.max(14, 15, 17, 18);
        assertThat(result, is(18));
    }
}