package org.darion.leetcode;

import java.util.Arrays;

public class MedianofTwoSortedArrays {

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {

		if (nums1 == null && nums2 == null && nums1.length == 0 && nums2.length == 0) {
			return 0;
		}

		int size = nums1.length + nums2.length;
		int[] array = new int[size];

		int index = 0, index1 = 0, index2 = 0;
		while (index1 < nums1.length && index2 < nums2.length) {
			if (nums1[index1] <= nums2[index2]) {
				array[index] = nums1[index1];
				index1 += 1;
			} else {
				array[index] = nums2[index2];
				index2 += 1;
			}

			index += 1;
		}

		while (index1 < nums1.length) {
			array[index++] = nums1[index1++];
		}

		while (index2 < nums2.length) {

			array[index++] = nums2[index2++];
		}

		System.out.println(Arrays.toString(nums1));
		System.out.println(Arrays.toString(nums2));
		System.out.println(Arrays.toString(array));
		return array[size / 2];
	}

	public static void main(String[] args) {
		// int[] a = { 1, 3, 5, 7, 9 };
		// int[] b = { 2, 4, 6, 8 };

		// int[] a = { 2, 4, 6, 8 };
		// int[] b = { 1, 3, 5, 7, 9 };

		int[] a = {};
		int[] b = { 2, 3 };

		MedianofTwoSortedArrays instance = new MedianofTwoSortedArrays();
		System.out.println(instance.findMedianSortedArrays(a, b));
	}
}
