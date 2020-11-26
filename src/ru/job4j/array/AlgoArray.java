package ru.job4j.array;

/**
 * строка 9 - переменная для временного хранения значение ячейки с индексом 0.
 * строка 10 - записываем в ячейку с индексом 0 значение ячейки с индексом 3
 * строка 12 - записываем в ячейку с индексом 3 значение временной переменной
 * автоматическое переименование числа - навести на имя числа -нажать Shift+F6-refactor-rename имя -, после переимонования -подтверидить
 * */
public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
        int temp = array[0];
        array[0] = array[3];
        array[3] = temp;
        temp = array[1];
        array[1] = array[2];
        array[2] = temp;
        temp = array[3];
        array[3] = array[4];
        array[4] = temp;
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}
