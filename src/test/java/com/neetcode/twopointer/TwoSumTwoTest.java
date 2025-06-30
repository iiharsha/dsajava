package com.neetcode.twopointer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TwoSumTwoTest {
    TwoSumTwo sol = new TwoSumTwo();

    @Test
    void testOne() {
        int[] expected = { 2, 3 };
        int[] nums = { 2, 3, 4 };
        int target = 7;
        Assertions.assertArrayEquals(expected, sol.twoSum(nums, target));
    }

    @Test
    void testTwo() {
        int[] expected = { 1, 2 };
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        Assertions.assertArrayEquals(expected, sol.twoSum(nums, target));
    }

    @Test
    void testThree() {
        int[] expected = { 1, 2 };
        int[] nums = { -1, 0 };
        int target = -1;
        Assertions.assertArrayEquals(expected, sol.twoSum(nums, target));
    }
}
