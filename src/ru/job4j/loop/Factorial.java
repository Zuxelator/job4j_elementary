package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        if (n == 0) {
            return 1;
        } else {
            int result = 1;
            for (int i = n; i >= 1; i--) {
                result *= i;
            }
            return result;
        }
    }
}
