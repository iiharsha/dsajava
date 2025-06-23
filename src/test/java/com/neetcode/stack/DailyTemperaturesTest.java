package com.neetcode.stack;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class DailyTemperaturesTest {
	DailtTemperatures sol = new DailtTemperatures();

	@Test
	void testOne() {
		int[] temperatures = { 73, 74, 75, 71, 69, 72, 76, 73 };
		int[] output = { 1, 1, 4, 2, 1, 1, 0, 0 };
		assertArrayEquals(output, sol.dailyTemperatures(temperatures));
	}

	@Test
	void testTwo() {
		int[] temperatures = { 30, 40, 50, 60 };
		int[] output = { 1, 1, 1, 0 };
		assertArrayEquals(output, sol.dailyTemperatures(temperatures));
	}

	@Test
	void testThree() {
		int[] temperatures = { 30, 60, 90 };
		int[] output = { 1, 1, 0 };
		assertArrayEquals(output, sol.dailyTemperatures(temperatures));
	}
}
