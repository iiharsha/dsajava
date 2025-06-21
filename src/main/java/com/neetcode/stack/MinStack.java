package com.neetcode.stack;

import java.util.ArrayDeque;
import java.util.Deque;

class MinStack {
	final private Deque<Integer> stack = new ArrayDeque<>();
	final private Deque<Integer> getMinStack = new ArrayDeque<>();

	public MinStack() {
		getMinStack.push(Integer.MAX_VALUE);
	}

	public void push(int val) {
		stack.push(val);
		getMinStack.push(Math.min(val, getMinStack.peek()));
	}

	public void pop() {
		stack.pop();
		getMinStack.pop();
	}

	public int top() {
		return stack.peek();
	}

	public int getMin() {
		return getMinStack.peek();
	}
}
