package org.darion.yaphet.lintcode;

import java.math.BigDecimal;

/**
 * http://www.lintcode.com/zh-cn/problem/cosine-similarity/
 * 
 * @author darion.yaphet
 *
 */
public class CosineSimilarity {

	public CosineSimilarity() {

	}

	/**
	 * @param A:
	 *            An integer array.
	 * @param B:
	 *            An integer array.
	 * @return: Cosine similarity.
	 */
	public double cosineSimilarity(int[] A, int[] B) {
		if (A == null || A.length == 0 || B == null || B.length == 0 || A.length != B.length) {
			// throw new IllegalArgumentException("Input Not Null");
			return new BigDecimal(2).setScale(4, BigDecimal.ROUND_HALF_UP).doubleValue();
		}

		double molecular = 0D;// 分子
		double denominator = 0D;// 分母

		for (int index = 0; index < A.length; index++) {
			molecular += A[index] * B[index];
		}

		// System.out.println(" molecular = " + molecular);

		double ATemp = 0D;
		for (int index = 0; index < A.length; index++) {
			ATemp += A[index] * A[index];
		}
		ATemp = Math.sqrt(ATemp);

		double BTemp = 0D;
		for (int index = 0; index < B.length; index++) {
			BTemp += B[index] * B[index];
		}
		BTemp = Math.sqrt(BTemp);
		denominator = ATemp * BTemp;

		if (denominator == 0) {
			// return new BigDecimal(2.0000D).setScale(4,
			// BigDecimal.ROUND_HALF_UP).doubleValue();
			return 2.0000D;
		}

		System.out.println(molecular + " --> " + denominator);

		String result = (molecular / denominator) + "";
		// BigDecimal decimal = new BigDecimal(molecular / denominator);
		// return decimal.setScale(4, BigDecimal.ROUND_HALF_UP).doubleValue();
		System.out.println(String.format(result, "%.4f"));
		return 0;
	}

	public static void main(String[] args) {
		int[] A = { 1, 2, 3 };
		int[] B = { 2, 3, 4 };

		// int[] A = { 0 };
		// int[] B = { 0 };
		CosineSimilarity instance = new CosineSimilarity();
		System.out.println(instance.cosineSimilarity(A, B));

		// System.out.println(Math.sqrt(9));
	}
}
