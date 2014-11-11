package org.darion.leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * Reverse digits of an integer.
 * 
 * Example1: x = 123, return 321
 * 
 * Example2: x = -123, return -321
 * 
 * @author darion
 * 
 */
public class ReverseInteger {

	public int reverse(int x) {
		// check & mark Negative Number
		boolean negative = false;
		if (x < 0) {
			negative = true;
		}

		// make sure x is Positive Number
		x = Math.abs(x);

		if (x == 0)
			return 0;

		// remove zero ending
		while ((x % 10) == 0) {
			x /= 10;
		}

		List<Integer> list = new LinkedList<Integer>();
		while (x > 0) {
			int token = x % 10;
			list.add(token);
			x /= 10;
		}

		int total = 0;
		int size = list.size();
		for (int index = 0; index < list.size(); index++) {
			total += list.get(size - 1 - index) * (int) Math.pow(10, index);
		}

		if (negative)
			total *= -1;

		if ((!negative && total < 0) || (negative && total > 0)) {
			return 0;
		}

		return total;
	}

	public static void main(String[] args) {
		ReverseInteger reverseInteger = new ReverseInteger();
		System.out.println(" 0    --> " + reverseInteger.reverse(0));
		System.out.println(" 6789 --> " + reverseInteger.reverse(6789));
		System.out.println("-6789 --> " + reverseInteger.reverse(-6789));

		System.out.println(" 3000 --> " + reverseInteger.reverse(3000));
		System.out.println(" 1000000003 --> "
				+ reverseInteger.reverse(1000000003));
	}
}
