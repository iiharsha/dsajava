package com.neetcode.stack;

import java.util.Stack;
import java.util.Arrays;

/*
 * 1. reate a stack
 * 2. insert cars with their postion and speed
 * 3. sort them in descending order
 * 4. calculate the timeTaken by car (target - position)/ speed;
 * 5. push to stack if timeTaken is greater than stack.peek()
 * 6. stack.size() is the answer
 * */

class CarFleet {
	public int carFleet(int target, int[] position, int[] speed) {
		Stack<Double> stack = new Stack<>();
		int N = position.length;
		Car[] cars = new Car[N];

		for (int i = 0; i < N; i++) {
			cars[i] = new Car(position[i], speed[i]);
		}

		Arrays.sort(cars, (a, b) -> Integer.compare(b.position, a.position));
		for (Car car : cars) {
			double timeTaken = car.timeTaken(target);

			if (stack.isEmpty() || timeTaken > stack.peek()) {
				stack.push(timeTaken);
			}
		}

		return stack.size();
	}
}

class Car {
	int position;
	int speed;

	Car(int position, int speed) {
		this.position = position;
		this.speed = speed;
	}

	double timeTaken(int target) {
		return (double) (target - position) / speed;
	}
}
