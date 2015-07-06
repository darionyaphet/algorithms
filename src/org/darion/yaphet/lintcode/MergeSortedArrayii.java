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

		if ((A == null || A.size() == 0) && (B == null || B.size() == 0)) {
			return new ArrayList<Integer>();
		} else {
			if (A == null || A.size() == 0) {
				return B;
			}

			if (B == null || B.size() == 0) {
				return A;
			}
		}

		int indexOfA = 0;
		int indexOfB = 0;
		int size = A.size() + B.size();

		ArrayList<Integer> result = new ArrayList<Integer>(size);
		for (int index = 0; index < size; index++) {
			int elementA = A.get(indexOfA);
			int elementB = B.get(indexOfB);
			if (elementA < elementB) {
				indexOfA += 1;
				result.add(elementA);
			} else {
				indexOfB += 1;
				result.add(elementB);
			}
		}
		return result;
	}

	public static void main(String[] args) {

		ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
		ArrayList<Integer> B = new ArrayList<Integer>(Arrays.asList(2, 4, 5, 6));

		MergeSortedArrayii instance = new MergeSortedArrayii();
		System.out.println(instance.mergeSortedArray(A, B));
	}

}
