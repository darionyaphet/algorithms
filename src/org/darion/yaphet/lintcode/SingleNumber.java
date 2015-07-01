package org.darion.yaphet.lintcode;

/**
 * http://www.lintcode.com/zh-cn/problem/single-number/
 * 
 * @author darion.yaphet
 * 
 */
public class SingleNumber {
	public SingleNumber() {

	}

	/**
	 * @param A
	 *            : an integer array return : a integer
	 */
	public int singleNumber(int[] A) {
		if (A == null || A.length == 0) {
			return 0;
		}
		
		int result = A[0];
		for (int index = 1; index < A.length; index++) {
			result ^= A[index];
		}

		return result;
	}

	public static void main(String[] args) {
		// System.out.println(1 ^ 1);
		int[] numbers = { 1, 2, 2, 1, 3, 4, 3 };
		SingleNumber instance = new SingleNumber();
		System.out.println(instance.singleNumber(numbers));
	}
}
