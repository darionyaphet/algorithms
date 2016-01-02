package org.darion.yaphet.leetcode;

import java.util.Stack;

public class MinStack {

	private int min = Integer.MAX_VALUE;
	private Stack<Integer> mines = new Stack<Integer>();
	private Stack<Integer> stack = new Stack<Integer>();

	public void push(int x) {
		if (x <= min) {
			min = x;
		}

		stack.push(x);
		mines.push(min);
	}

	public void pop() {
		stack.pop();
		mines.pop();
	}

	public int top() {
		return stack.peek();
	}

	public int getMin() {
		return mines.peek();
	}

	public static void main(String[] args) {
		MinStack stack = new MinStack();
		stack.push(2147483646);
		stack.push(2147483646);
		stack.push(2147483647);
		System.out.println(stack.top());
		stack.pop();
		System.out.println(stack.getMin());
		stack.pop();
		System.out.println(stack.getMin());
		stack.pop();
		stack.push(2147483647);

		System.out.println(stack.top());
		System.out.println(stack.getMin());
		stack.push(-2147483648);
		System.out.println(stack.top());
		System.out.println(stack.getMin());
		stack.pop();
		System.out.println(stack.getMin());
	}
}
