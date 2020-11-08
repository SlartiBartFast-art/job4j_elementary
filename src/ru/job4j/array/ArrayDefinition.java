package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("Размер массива равен: " + ages.length);
        String[] surname = new String[100500];
        System.out.println("Размер массива равен: " + surname.length);
        float[] price = new float[40];
        System.out.println("Размер массива равен: " + price.length);
        String[] names = new String[4];
        names[0] = "Ivan Ivanov";
        names[1] = "Petr Petrov";
        names[2] = "Semen Sidorov";
        names[3] = "Ivan Petrov";
    }
}
