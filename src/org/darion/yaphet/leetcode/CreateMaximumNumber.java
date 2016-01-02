package org.darion.yaphet.leetcode;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/create-maximum-number/
 * 
 * @author darion.yaphet
 *
 */
public class CreateMaximumNumber {

	public int[] maxNumber(int[] nums1, int[] nums2, int k) {
		return null;
	}

	public static void main(String[] args) {
		int[] nums1 = { 3, 4, 6, 5 };
		int[] nums2 = { 9, 1, 2, 5, 8, 3 };
		int k = nums1.length + nums2.length;

		CreateMaximumNumber instance = new CreateMaximumNumber();
		System.out.println(Arrays.toString(instance.maxNumber(nums1, nums2, k)));
	}
}
