package ru.job4j.condition;
/** Было
 *  public static double distance(int x1, int y1, int x2, int y2) {
 *         int z = (x2 - x1);
 *         int w = (y2 - y1);
 *         double a = Math.pow(z, 2);
 *         double b = Math.pow(w, 2);
 *         double r = a + b;
 *         double rsl = Math.sqrt(r);
 *         return rsl;
 *         }
 *         public static void main(String[] args) {
 *         double result = Point.distance(11, 15, 20, 24);
 *         System.out.println("result (11, 15) to (20, 24) " + result);
 * */
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

    public class Point {
        private int x;

        private int y;


    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }


    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        System.out.println(dist);
    }
}
