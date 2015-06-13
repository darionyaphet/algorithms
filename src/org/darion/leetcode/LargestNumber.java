package org.darion.leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {

	public String largestNumber(int[] num) {
		String[] array = new String[num.length];
		for (int index = 0; index < num.length; index++) {
			array[index] = num[index] + "";
		}

		Arrays.sort(array, new Comparator<String>() {
			@Override
			public int compare(String string1, String string2) {
				String value1 = string1 + string2;
				String value2 = string2 + string1;
				return value1.compareTo(value2);
			}
		});

		if ("0".equals(array[array.length-1])) {
			return "0";
		}

		StringBuilder builder = new StringBuilder();
		for (int index = array.length - 1; index >= 0; index--) {
			builder.append(array[index]);
		}
		return builder.toString();
	}

	public static void main(String[] args) {
		// int[] array = { 3, 30, 34, 5, 9 };
		int[] array = {1,2,3,4,5,6,7,8,9,0 };
		LargestNumber largestNumber = new LargestNumber();
		System.out.println(largestNumber.largestNumber(array));

		// compare compare = new compare();
		// compare.compare(1, 2);
		// compare.compare(2, 1);
		// compare.compare(2, 2);
		//
		// compare.compare(21, 3);
		// compare.compare(30000, 3);
	}

	private class IndexComparer implements Comparator<Integer> {

		@Override
		public int compare(Integer int1, Integer int2) {
			String string1 = (int1 + "");
			String string2 = (int2 + "");

			String value1 = string1 + string2;
			String value2 = string2 + string1;
			return value1.compareTo(value2);
		}
	}

	// private String largestNumber(Integer[] array) {
	// Arrays.sort(array, new IndexComparer());
	// StringBuilder builder = new StringBuilder();
	// for (int index = array.length - 1; index >= 0; index--) {
	// builder.append(array[index]);
	// }
	// return builder.toString();
	// }
}
