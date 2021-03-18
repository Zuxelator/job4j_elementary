package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 1;
        while (amount * percent > salary) {
            year++;
            amount -= salary;
        }

        return year;
    }
}
