package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int postA = 0, postB = 0;
        for (int i = 0; i < rsl.length; i++) {
            if (postA == left.length) {
                rsl[i] = right[postB];
                postB++;
            } else if (postB == right.length) {
                    rsl[i] = left[postA];
                    postA++;
                } else if (left[postA] < right[postB]) {
                    rsl[i] = left[postA];
                    postA++;
                } else {
                    rsl[i] = right[postB];
                    postB++;
                }
            }
            return rsl;
        }
    }

