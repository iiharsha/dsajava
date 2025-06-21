package com.neetcode.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinStackTest {

	private MinStack minStack;

	@BeforeEach
	void setUp() {
		minStack = new MinStack();
	}

	@Test
	void testPushAndGetMin() {
		minStack.push(5);
		assertEquals(5, minStack.getMin());

		minStack.push(3);
		assertEquals(3, minStack.getMin());

		minStack.push(7);
		assertEquals(3, minStack.getMin());
	}

	@Test
	void testPop() {
		minStack.push(5);
		minStack.push(3);
		minStack.push(7);

		minStack.pop(); // pops 7
		assertEquals(3, minStack.getMin());

		minStack.pop(); // pops 3
		assertEquals(5, minStack.getMin());
	}

	@Test
	void testTop() {
		minStack.push(5);
		minStack.push(3);
		assertEquals(3, minStack.top());
	}
}
