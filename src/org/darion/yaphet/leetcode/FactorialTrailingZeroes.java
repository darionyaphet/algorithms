package org.darion.yaphet.leetcode;

public class FactorialTrailingZeroes {

	// time out
	// public int trailingZeroes(int n) {
	// if (n == 0) {
	// return 1;
	// }
	//
	// long result = 1;
	// for (int index = 1; index <= n; index++) {
	// result *= index;
	// }
	// // System.out.println(result);
	//
	// int number = 0;
	// while (true) {
	// if (result % 10 == 0) {
	// number++;
	// result /= 10;
	// } else {
	// break;
	// }
	// }
	//
	// return number;
	// }

	public int trailingZeroes(int n) {
		if (n == 0) {
			return 0;
		}

		int numbers = 0;
		while (n / 5 != 0) {
			n /= 5;
			numbers += n;
		}

		return numbers;
	}

	public static void main(String[] args) {
		FactorialTrailingZeroes zeroes = new FactorialTrailingZeroes();
		System.out.println(zeroes.trailingZeroes(5));
	}

}
