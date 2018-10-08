package org.darion.yaphet.lintcode;

/**
 * http://www.lintcode.com/zh-cn/problem/fibonacci/
 */
public class Fibonacci {
    public int fibonacci(int n) {
        if (n < 1) {
            return -1;
        }

        if (n == 1) {
            return 0;
        }

        if (n == 2) {
            return 1;
        }

        int sum = 0;
        int i = 0, j = 1;
        for (int p = 2; p < n; p++) {
            sum = i + j;
            i = j;
            j = sum;
        }

        return sum;
    }

    public static void main(String[] args) {
        Fibonacci instance = new Fibonacci();
        System.out.println(instance.fibonacci(10));
    }
}
