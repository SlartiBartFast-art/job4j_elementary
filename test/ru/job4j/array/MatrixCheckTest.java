package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class MatrixCheckTest {

    @Test
    public void monoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };
        boolean result = MatrixCheck.monoHorizontal(input, 1);
        assertThat(result, is(true));
    }
    @Test
    public void monoHorizontal1() {
        char[][] input = {
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
                {' ', ' ', ' '},
        };
        boolean result = MatrixCheck.monoHorizontal(input, 0);
        assertThat(result, is(true));
    }
    @Test
    public void monoHorizontal2() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };
        boolean result = MatrixCheck.monoHorizontal(input, 0);
        assertThat(result, is(false));
    }
}