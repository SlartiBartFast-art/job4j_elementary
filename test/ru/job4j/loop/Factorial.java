package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 1;
        for (int fac = 1; fac <= n; fac++) {
            result *= fac;
        }
        return result;
    }
}

