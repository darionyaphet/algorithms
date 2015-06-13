package org.darion.yaphet.algorithm;

import java.util.Arrays;

public class Add {

	public static int add(String one, String another) {
		char[] ones = new StringBuilder(one).reverse().toString().toCharArray();
		char[] anothers = new StringBuilder(another).reverse().toString()
				.toCharArray();
		System.out.println(Arrays.toString(ones));
		System.out.println(Arrays.toString(anothers));
		int size = ones.length < anothers.length ? ones.length
				: anothers.length;
		// System.out.println(size);
		int[] results = new int[size];
		System.out.println(Arrays.toString(results));
		for (int index = 0; index < size; index++) {
			// System.out.println(Integer.valueOf(ones[index]) + "\t"
			// + Integer.valueOf(anothers[index]));
			//
			// System.out.println((ones[index]) + "\t" + (anothers[index]));

			results[index] = Integer.valueOf(ones[index])
					+ Integer.valueOf(anothers[index]) - 48 * 2;
		}

		if (ones.length < anothers.length) {
			
		} else {

		}
		
		System.out.println(Arrays.toString(results));
		return 0;
	}

	public static void main(String[] args) {
		System.out.println(add("10", "4"));
	}
}
