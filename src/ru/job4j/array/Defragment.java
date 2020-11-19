package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        int point, cell;
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                 point = index; /* указатель на null ячейку. */
                /* переместить первую не null ячейку. Нужен цикл. */
                for (int j = index; j < array.length; j++) {
                    if (array[j] != null) {
                        //cell = j;

                        //String pow = array[point];
                        array[index] = array[j];
                        array[j] = null;
                        break;

                    }
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}
