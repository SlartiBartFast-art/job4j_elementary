package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] numders = new int[4];
        for (int index = 0; index < numders.length; index++) {
            numders[index] = index * 2 + 3;
        }
        for (int index : numders) {
            System.out.println(index);
        }
    }
}
