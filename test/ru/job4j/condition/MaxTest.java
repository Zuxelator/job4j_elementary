package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

    public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

        @Test
        public void whenMax2To1Then2() {
            int left = 2;
            int right = 1;
            int result = Max.max(left, right);
            int expected = 2;
            Assert.assertEquals(result, expected);
        }

        @Test
        public void whenMax2To5Then5() {
            int left = 2;
            int right = 5;
            int result = Max.max(left, right);
            int expected = 5;
            Assert.assertEquals(result, expected);
        }

        @Test
        public void whenMax5To5Then5() {
            int left = 5;
            int right = 5;
            int result = Max.max(left, right);
            int expected = 5;
            Assert.assertEquals(result, expected);
        }

        @Test
        public void whenMax3to6to8Then8() {
        int first = 3;
        int second = 6;
        int third = 8;
        int result = Max.max(first, second, third);
        int expected = 8;
        Assert.assertEquals(result, expected);
        }

        @Test
        public void whenMax3to6to18to15Then18() {
            int first = 3;
            int second = 6;
            int third = 18;
            int fourth = 15;
            int result = Max.max(first, second, third, fourth);
            int expected = 18;
            Assert.assertEquals(result, expected);
        }
}