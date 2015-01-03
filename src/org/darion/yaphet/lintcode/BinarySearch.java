package org.darion.yaphet.lintcode;

import org.omg.PortableServer.POA;

public class BinarySearch {
	/**
	 * @param nums
	 *            : The integer array.
	 * @param target
	 *            : Target to find.
	 * @return: The first position of target. Position starts from 0.
	 */
	public int binarySearch(int[] nums, int target) {
		int lower = 0;
		int upper = nums.length - 1;

		while (lower < upper) {
			int pivot = (lower + upper) / 2;
			System.out.println(lower + ":" + upper + "\t" + nums[pivot] + "\t"
					+ target);

			if (pivot == 3)
				System.exit(0);

			if (nums[pivot] == target) {
				int position = pivot;
				while (true) {
					if (position == 0) {
						return pivot;
					}

					if (nums[position - 1] != target) {
						break;
					} else {
						position -= 1;
						pivot = position;
					}
				}
				return pivot;

			} else if (nums[pivot] > target) {
				System.out.println("upper --> " + pivot);
				upper = pivot;
			} else {
				System.out.println("lower --> " + lower);
				lower = pivot;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		int[] array = { 4, 5, 9, 9, 12, 13, 14, 15, 15, 18 };

		BinarySearch search = new BinarySearch();
		System.out.println(search.binarySearch(array, 10));
	}
}
