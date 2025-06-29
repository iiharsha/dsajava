package com.neetcode.stack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

class LargestRectangleArea {
	public int largestRectangleArea(int[] heights) {
		int size = heights.length;
		int maxArea = 0;
		int currArea = 0;

		/*
		 * rightBounds, leftBounds hold the bounds of the largest possible
		 * rectangle for heights[i]
		 */
		int[] rightBounds = new int[size];
		int[] leftBounds = new int[size];

		Deque<Integer> stack = new ArrayDeque<>();

		// initialize the rightBounds with the value of heights length
		Arrays.fill(rightBounds, size);

		for (int i = 0; i < size; ++i) {

			while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
				rightBounds[stack.pop()] = i;
			}

			leftBounds[i] = stack.isEmpty() ? -1 : stack.peek();

			stack.push(i);
		}

		for (int i = 0; i < size; ++i) {
			int width = rightBounds[i] - leftBounds[i] - 1;
			currArea = heights[i] * width;
			maxArea = Math.max(maxArea, currArea);
		}

		return maxArea;
	}
}
