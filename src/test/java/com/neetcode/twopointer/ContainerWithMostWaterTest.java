package com.neetcode.twopointer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContainerWithMostWaterTest {
    ContainerWithMostWater sol = new ContainerWithMostWater();

    @Test
    void testOne() {
        int expected = 49;
        int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };

        Assertions.assertEquals(expected, sol.maxArea(height));
    }

    @Test
    void testTwo() {
        int expected = 1;
        int[] height = { 1, 1 };

        Assertions.assertEquals(expected, sol.maxArea(height));
    }
}
