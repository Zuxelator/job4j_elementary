package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] nums = new int[5];

        for (int index = 0; index < nums.length; index++) {
            nums[index] = index * 2 + 3;
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
