package org.darion.yaphet.lintcode;

public class ImplementQueueByTwoStacks {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.push(1);
        System.out.println(queue.pop());
        queue.push(2);
        queue.push(3);
        System.out.println(queue.top());
        System.out.println(queue.pop());
    }
}
