package org.darion.yaphet.lintcode;

import java.util.Stack;

public class MyQueue {
    private Stack<Integer> stack;
    private Stack<Integer> stack2;

    public MyQueue() {
        this.stack = new Stack<>();
        this.stack2 = new Stack<>();
    }

    /*
     * @param element: An integer
     * @return: nothing
     */
    public void push(int element) {
        stack.push(element);
    }

    /*
     * @return: An integer
     */
    public int pop() {
        // write your code here
        while (!stack.empty()) {
            int value = stack.pop();
            stack2.push(value);
        }
        int result = stack2.pop();
        while (!stack2.empty()) {
            int value = stack2.pop();
            stack.push(value);
        }
        return result;
    }

    /*
     * @return: An integer
     */
    public int top() {
        // write your code here
        while (!stack.empty()) {
            int value = stack.pop();
            stack2.push(value);
        }
        int result = stack2.peek();
        while (!stack2.empty()) {
            int value = stack2.pop();
            stack.push(value);
        }
        return result;
    }
}