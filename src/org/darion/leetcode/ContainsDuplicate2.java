package org.darion.leetcode;

import java.util.HashMap;

public class ContainsDuplicate2 {

	public ContainsDuplicate2() {

	}

	public boolean containsNearbyDuplicate(int[] nums, int k) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int index = 0; index < nums.length; index++) {

			if (map.containsKey(nums[index])) {
				int value = map.get(nums[index]);
				int distance = Math.abs(value - index);
				if (distance <= k) {
					return true;
				} else {
					map.put(nums[index], index);
				}
			} else {
				map.put(nums[index], index);
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int k = 2;
		int[] nums = { 99, 99 };
		ContainsDuplicate2 duplicate = new ContainsDuplicate2();
		System.out.println(duplicate.containsNearbyDuplicate(nums, k));
	}

}
