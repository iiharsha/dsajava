package com.neetcode.twopointer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TrappingRainWaterTest {
    TrappingRainWater sol = new TrappingRainWater();

    @Test
    void testOne() {
        int expected = 6;
        int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        int actual = sol.trap(height);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testTwo() {
        int expected = 9;
        int[] height = { 4, 2, 0, 3, 2, 5 };
        int actual = sol.trap(height);
        Assertions.assertEquals(expected, actual);
    }
}
