package org.darion.leetcode;

import java.util.Arrays;

public class RotateArray {

	// time out
	// public void rotate(int[] nums, int k) {
	// int lastIndex = nums.length - 1;
	// for (int index = 0; index < k; index++) {
	// int lastNumber = nums[lastIndex];
	// for (int position = lastIndex; position >= 1; position--) {
	// nums[position] = nums[position - 1];
	// }
	//
	// nums[0] = lastNumber;
	// }
	// }

	public void rotate(int[] nums, int k) {
		int[] newArray = new int[nums.length];
		int lastIndex = nums.length - 1;
		for (int index = 0; index < k; index++) {
			// System.out.println(nums[lastIndex - k + index + 1]);
			newArray[index] = nums[lastIndex - k + index + 1];
		}

		for (int index = 0; index < lastIndex - k + 1; index++) {
			System.out.println(nums[index]);
			newArray[index] = nums[lastIndex];
		}
	}

	public static void main(String[] args) {
		final int[] numbers = { 1, 2, 3, 4, 5, 6, 7 };
		RotateArray array = new RotateArray();
		array.rotate(numbers, 3);
		System.out.println(Arrays.toString(numbers));
	}
}
