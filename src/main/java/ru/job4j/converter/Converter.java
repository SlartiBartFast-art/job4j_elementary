package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result :" + passed);
        int in1 = 120;
        int expected1 = 2;
        int out1 = Converter.rubleToDollar(in);
        boolean passed1 = expected == out;
        System.out.println("120 rubles are 2. Test result :" + passed1);
        int euro = Converter.rubleToEuro(140);
        int usd = Converter.rubleToDollar(120);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("120 rubles are " + usd + " usd.");

    }
}
