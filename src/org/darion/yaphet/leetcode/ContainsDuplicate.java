package org.darion.yaphet.leetcode;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
	public ContainsDuplicate() {

	}

	public boolean containsDuplicate(int[] nums) {
		Set<Integer> set = new HashSet<Integer>();
		for (int element : nums) {
			if (set.contains(element)) {
				return true;
			} else {
				set.add(element);
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] true_array = { 1, 2, 3, 4, 5, 6, 2 };
		int[] false_array = { 1, 2, 3, 4, 5, 6 };
		ContainsDuplicate duplicate = new ContainsDuplicate();
		System.out.println(duplicate.containsDuplicate(true_array));
		System.out.println(duplicate.containsDuplicate(false_array));
	}
}
