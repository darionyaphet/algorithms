package org.darion.leetcode;

/**
 * Given an integer array nums, find the sum of the elements between indices i
 * and j (i ≤ j), inclusive.
 * 
 * https://leetcode.com/problems/range-sum-query-immutable/
 * 
 * @author Darion.Yaphet
 *
 */
public class RangeSumQueryImmutable {
	private int[] array;

	public RangeSumQueryImmutable(int[] nums) {
		this.array = nums;
	}

	public int sumRange(int i, int j) {

		return 0;
	}

	public static void main(String[] args) {
		int[] array = { -2, 0, 3, -5, 2, -1 };

		RangeSumQueryImmutable instance = new RangeSumQueryImmutable(array);
		System.out.println(instance.sumRange(0, 1));
		System.out.println(instance.sumRange(1, 2));
	}
}
