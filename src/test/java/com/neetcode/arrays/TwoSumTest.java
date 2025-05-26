package com.neetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TwoSumTest {

    @Test
    public void testTwoSum() {
        TwoSum solver = new TwoSum();
        int[] res = solver.twoSum(new int[] { 2, 7, 11, 15 }, 9);
        assertArrayEquals(new int[] { 0, 1 }, res);
    }

}
