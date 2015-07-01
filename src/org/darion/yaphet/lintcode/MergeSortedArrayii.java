package org.darion.yaphet.lintcode;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * http://www.lintcode.com/zh-cn/problem/merge-sorted-array-ii/
 * 
 * @author darion.yaphet
 * 
 */
public class MergeSortedArrayii {
	public MergeSortedArrayii() {

	}

	/**
	 * @param A
	 *            and B: sorted integer array A and B.
	 * @return: A new sorted integer array
	 */
	public ArrayList<Integer> mergeSortedArray(ArrayList<Integer> A,
			ArrayList<Integer> B) {

		return null;
	}

	public static void main(String[] args) {
		ArrayList<Integer> A = (ArrayList<Integer>) Arrays.asList(1, 2, 3, 4);
		ArrayList<Integer> B = (ArrayList<Integer>) Arrays.asList(2, 4, 5, 6);

		MergeSortedArrayii instance = new MergeSortedArrayii();
		System.out.println(instance.mergeSortedArray(A, B));

	}

}
