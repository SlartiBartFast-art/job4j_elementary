package ru.job4j.condition;

public class SwitchWeek {
    public String nameOfDay(int day) {
        String name;
        switch (7) {
            case 1:
                name = "job do 18.00";
                break;
            case 2:
                name = "job to 18.00";
                break;
            case 3:
                name = "job to 18.00";
                break;
            case 4:
                name = "job to 18.00";
                break;
            case 5:
                name = "job to 18.00";
                break;
            case 6:
                name = "job to 16.00";
                break;
            case 7:
                name = "weekend";
                break;
            default:
                name = "Ошибка";
                break;

        }
    }
}