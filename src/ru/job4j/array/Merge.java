package ru.job4j.array;
//Даны два отсортированных по возрастанию массива. Как без сортировки их объединить в третий массив?
public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int leftIndex = 0;
        int rightIndex = 0;
        int rslIndex;
        for (rslIndex = 0; rslIndex < rsl.length; rslIndex++) {
            while (leftIndex < left.length && rightIndex < right.length) {
                rsl[rslIndex++] = left[leftIndex] < right[rightIndex] ? left[leftIndex++] : right[rightIndex++];
            }
            rsl[rslIndex] = leftIndex == left.length ? right[rightIndex++] : left[leftIndex++];
        }
        return rsl;
    }
}