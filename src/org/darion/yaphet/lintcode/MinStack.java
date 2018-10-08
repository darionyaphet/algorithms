package org.darion.yaphet.lintcode;

import java.util.Stack;

public class MinStack {

    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        minStack = new Stack<>();
        stack = new Stack<>();
    }

    public void push(int number) {
        stack.push(number);
        if (!minStack.isEmpty()) {
            int currentMin = minStack.peek();
            if (currentMin < number) {
                minStack.push(currentMin);
            } else {
                minStack.push(number);
            }
        } else {
            minStack.push(number);
        }
    }

    public int pop() {
        minStack.pop();
        return stack.pop();
    }

    public int min() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        MinStack stack = new MinStack();
        stack.push(1);
        System.out.println(stack.pop());
        stack.push(2);
        stack.push(3);
        System.out.println(stack.min());
        stack.push(1);
        System.out.println(stack.min());
    }
}
