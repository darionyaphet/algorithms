package org.darion.yaphet.lintcode;

/**
 * http://www.lintcode.com/zh-cn/problem/fibonacci/
 * 
 * @author darion.yaphet
 *
 */
public class Fibonacci {

	public int fibonacci(int n) {
		if (n - 1 == 0) {
			return 0;
		}

		if (n - 1 == 1) {
			return 1;
		}

		int num0 = 0, num1 = 1, result = 0;
		for (int index = 2; index < n; index++) {
			result = num0 + num1;
			num0 = num1;
			num1 = result;
		}
		return result;
	}

	public static void main(String[] args) {
		Fibonacci instance = new Fibonacci();
		System.out.println(instance.fibonacci(1));
		System.out.println(instance.fibonacci(2));
		System.out.println(instance.fibonacci(5));
		System.out.println(instance.fibonacci(7));
	}
}
