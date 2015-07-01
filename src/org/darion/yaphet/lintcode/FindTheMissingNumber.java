package org.darion.yaphet.lintcode;

import java.util.Arrays;

/**
 * http://www.lintcode.com/zh-cn/problem/find-the-missing-number/
 * 
 * @author darion.yaphet
 * 
 */
public class FindTheMissingNumber {
	public FindTheMissingNumber() {

	}

	/**
	 * @param nums
	 *            : an array of integers
	 * @return: an integer
	 */
	public int findMissing(int[] nums) {

		if (nums == null || nums.length == 0)
			return 0;

		Arrays.sort(nums);

		for (int index = 0; index < nums.length; index++) {
			if (nums[index] > index) {
				return index;
			}
		}
		return nums[nums.length - 1] + 1;
	}

	public static void main(String[] args) {
		FindTheMissingNumber instance = new FindTheMissingNumber();
		int[] array = { 0, 1, 3 };
		System.out.println(instance.findMissing(array));
	}
}
