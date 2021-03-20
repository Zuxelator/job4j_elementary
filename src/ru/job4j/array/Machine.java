package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];

        int val = money - price;
        int j = 0;
        for (int i = 0; i < coins.length; i++) {
            while (val - coins[i] >= 0) {
                val -= coins[i];
                rsl[j++] = coins[i];
            }
        }
        int size = j;
        return Arrays.copyOf(rsl, size);
    }
}
