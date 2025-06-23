package com.neetcode.stack;

import java.util.ArrayDeque;
import java.util.Deque;

class DailtTemperatures {
	/*
	 * Input: temperatures = [73,74,75,71,69,72,76,73] Output: [1,1,4,2,1,1,0,0]
	 */

	public int[] dailyTemperatures(int[] temperatures) {
		int n = temperatures.length;
		int[] res = new int[n];
		Deque<Integer> stack = new ArrayDeque<>();

		for (int i = 0; i < n; ++i) {

			while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
				int prev = stack.pop(); // get the index from the top of the stack and remove stack element
				res[prev] = i - prev; // calculate the number of days and update the res array
			}

			stack.push(i); // push the current index onto the stack
		}

		return res;
	}
}
