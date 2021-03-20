package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort1() {
        int[] data = new int[] {13, 24, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 13, 24};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort2() {
        int[] data = new int[] {100, -24, 1, 300, 544};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {-24, 1, 100, 300, 544};
        Assert.assertArrayEquals(expected, result);
    }
}