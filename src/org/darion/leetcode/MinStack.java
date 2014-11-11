package org.darion.leetcode;

import java.util.Arrays;

/**
 * Design a stack that supports push, pop, top, and retrieving the minimum
 * element in constant time.
 * 
 * push(x) -- Push element x onto stack.
 * 
 * pop() -- Removes the element on top of the stack.
 * 
 * top() -- Get the top element.
 * 
 * getMin() -- Retrieve the minimum element in the stack.
 * 
 * @author darion
 * 
 */
public class MinStack {

	// array-init-size
	private static final int DEFAULT_STACK_SIZE = 32;

	// EXPAND_SIZE should be related with array-init size ?
	private static final int EXPAND_SIZE = 8;

	private int[] array;
	private int[] mins;
	private int index = 0;
	private int min = Integer.MAX_VALUE;

	public MinStack() {
		array = new int[DEFAULT_STACK_SIZE];
		mins = new int[DEFAULT_STACK_SIZE];
	}

	public MinStack(int size) {
		array = new int[size];
		mins = new int[size];
	}

	public void push(int x) {
		if (index >= array.length) {
			expandArray();
		}

		array[index] = x;
		if (x < min) {
			mins[index] = x;
			min = x;
		} else {
			mins[index] = min;
		}

		System.out
				.println("Stack : " + array[index] + "\tMin : " + mins[index]);
		index++;
	}

	private void expandArray() {
		System.out.println("Expanding ... ");
		int expandSize = array.length + EXPAND_SIZE;
		int[] expandArray = new int[expandSize];
		int[] expandMins = new int[expandSize];

		System.arraycopy(array, 0, expandArray, 0, array.length);
		System.arraycopy(mins, 0, expandMins, 0, mins.length);

		array = expandArray;
		mins = expandMins;

		System.out.println("After Expanding ...");
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(mins));
	}

	public void pop() {
		index--;
	}

	public int top() {
		return array[index];
	}

	public int getMin() {
		return mins[index];
	}

	public static void main(String[] args) {
		// push 1 3 5 4 2 0
		MinStack stack = new MinStack(4);
		stack.push(3);
		stack.push(5);
		stack.push(4);
		stack.push(1);
		stack.push(2);
		stack.push(0);

		stack.pop();
		System.out.println("TOP : " + stack.top());
		stack.pop();
		System.out.println("TOP : " + stack.top());
	}
}
