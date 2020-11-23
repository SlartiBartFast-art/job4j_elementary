package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int count = 0;
        for (int i = 0; i < left.length; i++) {
            rsl[i] = left[i];
            count++;

        }
        for (int j = 0; j < rsl.length; j++) {
            if (count <= rsl.length - 1) {
                rsl[count] = right[j];
                count++;
            }


        }
        return rsl;
    }
}
