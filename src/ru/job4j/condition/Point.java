package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        int z = (x2 - x1);
        int w = (y2 - y1);
        double a = Math.pow(z, 2);
        double b = Math.pow(w, 2);
        double r = a + b;
        double rsl = Math.sqrt(r);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(11, 15, 20, 24);
        System.out.println("result (11, 15) to (20, 24) " + result);
    }
}
