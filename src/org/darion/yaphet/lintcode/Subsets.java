package org.darion.yaphet.lintcode;

import java.util.ArrayList;

public class Subsets {
	/**
	 * @param S:
	 *            A set of numbers.
	 * @return: A list of lists. All valid subsets.
	 */
	public ArrayList<ArrayList<Integer>> subsets(int[] nums) {
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		return list;
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3 };
		Subsets instance = new Subsets();
		System.out.println(instance.subsets(array));
	}
}
