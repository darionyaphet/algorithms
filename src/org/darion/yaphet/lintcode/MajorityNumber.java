package org.darion.yaphet.lintcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * http://www.lintcode.com/zh-cn/problem/majority-number/
 * 
 * @author darion.yaphet
 * 
 */
public class MajorityNumber {

	public MajorityNumber() {

	}

	/**
	 * @param nums
	 *            : a list of integers
	 * @return: find a majority number
	 */
	public int majorityNumber(ArrayList<Integer> nums) {
		int size = nums.size();
		int counter = 1;

		Collections.sort(nums);
		int current = nums.get(0);
		for (int index = 1; index < size; index++) {
			if (nums.get(index) == current) {
				counter += 1;
			} else {
				current = nums.get(index);
				counter = 1;
			}
			if (counter > (int) size / 2) {
				return current;
			}
		}

		return 0;
	}

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(1, 1, 1,
				1, 2, 2, 2));
		System.out.println(nums);
		MajorityNumber instance = new MajorityNumber();
		System.out.println(instance.majorityNumber(nums));
	}
}
