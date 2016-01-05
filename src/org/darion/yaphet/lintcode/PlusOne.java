package org.darion.yaphet.lintcode;

import java.util.Arrays;

public class PlusOne {
	public int[] plusOne(int[] digits) {

		boolean all9 = true;
		for (int element : digits) {
			if (element != 9) {
				all9 = false;
			}
		}

		if (all9) {
			int[] result = new int[digits.length + 1];
			result[0] = 1;
			return result;
		}

		return digits;
	}

	public static void main(String[] args) {
		// int[] array = { 1, 2, 3 };
		// int[] array = { 7, 9, 9 };
		int[] array = { 9, 9, 9 };
		PlusOne instance = new PlusOne();
		System.out.println(Arrays.toString(instance.plusOne(array)));
	}
}
