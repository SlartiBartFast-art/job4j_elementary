package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int i = first > second ? first : third;
        int result = i > third ? i : third;
        return result;
    }

    public static void main(String[] args) {
        int rsl = MultiMax.max(3, 5, 7);
        System.out.println(rsl);
    }
}
