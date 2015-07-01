package org.darion.yaphet.lintcode;

import java.util.ArrayList;
import java.util.List;

/**
 * http://www.lintcode.com/zh-cn/problem/continuous-subarray-sum/
 * 
 * @author 2011204
 * 
 */
public class ContinuousSubarraySum {

	public ContinuousSubarraySum() {

	}

	/**
	 * @param A
	 *            an integer array
	 * @return A list of integers includes the index of the first number and the
	 *         index of the last number
	 */
	public ArrayList<Integer> continuousSubarraySum(int[] A) {
		ArrayList<Integer> result = new ArrayList<Integer>();

		return result;
	}

	public static void main(String[] args) {
		int[] nums = { -3, 1, 3, -3, 4 };
		ContinuousSubarraySum instance = new ContinuousSubarraySum();
		List<Integer> result = instance.continuousSubarraySum(nums);
		System.out.println(result);
	}
}
