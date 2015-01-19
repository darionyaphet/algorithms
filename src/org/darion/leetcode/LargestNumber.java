package org.darion.leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {
	public String largestNumber(Integer[] num) {

		Arrays.sort(num, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {	
				return 0;
			}
		});
		return "";
	}

	public static void main(String[] args) {
		int[] array = { 3, 30, 34, 5, 9 };
		LargestNumber largestNumber = new LargestNumber();
		System.out.println(largestNumber.largestNumber(array));
	}
}
