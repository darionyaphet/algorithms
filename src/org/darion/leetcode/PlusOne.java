package org.darion.leetcode;

import java.util.Arrays;

public class PlusOne {
	public PlusOne() {

	}

	public int[] plusOne(int[] digits) {
		int size = digits.length - 1;
		if (digits[size] < 9) {
			digits[size]++;
		} else {
			for (int index = size; index >= 0; index--) {
				if (digits[index] < 9) {
					digits[index]++;
					break;
				} else {
					digits[index] = 0;
					if (index == 0) {
						digits = new int[size + 2];
						digits[0] = 1;
						for (int i = 1; i <= size; i++) {
							digits[i] = 0;
						}
					}
				}
			}
		}
		return digits;
	}

	public static void main(String[] args) {
		// int[] array = { 1, 2, 3 };
		// int[] array = { 1, 2, 9, 9, 9 };
		// int[] array = { 1, 2, 9, 0, 9 };
		// int[] array = { 9 };
		int[] array = { 9, 9, 9 };
		PlusOne plusOne = new PlusOne();
		array = plusOne.plusOne(array);
		System.out.println(Arrays.toString(array));
	}
}
