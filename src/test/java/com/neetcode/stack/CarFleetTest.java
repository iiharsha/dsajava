package com.neetcode.stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CarFleetTest {
	CarFleet sol = new CarFleet();

	@Test
	void testOne() {
		int ans = 1;
		int[] position = { 0, 2, 4 };
		int[] speed = { 4, 2, 1 };
		int target = 100;
		assertEquals(ans, sol.carFleet(target, position, speed));
	}

	@Test
	void testTwo() {
		int ans = 3;
		int[] position = { 10, 8, 0, 5, 3 };
		int[] speed = { 2, 4, 1, 1, 3 };
		int target = 12;
		assertEquals(ans, sol.carFleet(target, position, speed));
	}

	@Test
	void testThree() {
		int ans = 1;
		int[] position = { 3 };
		int[] speed = { 3 };
		int target = 10;
		assertEquals(ans, sol.carFleet(target, position, speed));
	}
}
