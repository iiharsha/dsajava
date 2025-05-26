package com.neetcode.arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class TopKFreqElementsTest {

    @Test
    public void testingTopKFreqElements() {
        int[] nums = { 1, 1, 1, 2, 2, 3 };
        int[] expected = { 1, 2 };

        TopKFreqElements sol = new TopKFreqElements();
        assertArrayEquals(expected, sol.topKFreqElements(nums, 2));
    }

}
