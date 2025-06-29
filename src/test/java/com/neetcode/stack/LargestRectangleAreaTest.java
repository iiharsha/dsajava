package com.neetcode.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LargestRectangleAreaTest {
	LargestRectangleArea sol = new LargestRectangleArea();

	@Test
	void testOne() {
		int[] heights = { 2, 1, 5, 6, 2, 3 };
		int res = sol.largestRectangleArea(heights);
		Assertions.assertEquals(10, res, "The answer should be 10");
	}

	@Test
	void testTwo() {
		int[] heights = { 2, 4};
		int res = sol.largestRectangleArea(heights);
		Assertions.assertEquals(4, res, "The answer should be 4");
	}

}
