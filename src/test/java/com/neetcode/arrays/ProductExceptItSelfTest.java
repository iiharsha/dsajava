package com.neetcode.arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class ProductExceptItSelfTest {

    ProductExceptItSelf sol = new ProductExceptItSelf();

    @Test
    public void testingProductExceptItSelf() {
        int[] nums = { 1, 2, 3, 4 };
        int[] expected = { 24, 12, 8, 6 };
        assertArrayEquals(expected, sol.productExceptItSelf(nums));
    }
}
