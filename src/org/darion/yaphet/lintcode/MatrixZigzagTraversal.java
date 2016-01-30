package org.darion.yaphet.lintcode;

import java.util.Arrays;

/**
 * http://www.lintcode.com/zh-cn/problem/matrix-zigzag-traversal/
 * 
 * @author darion.johannes.yaphet
 *
 */
public class MatrixZigzagTraversal {

	private static final int[][] MATRIX = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };

	/**
	 * @param matrix:
	 *            a matrix of integers
	 * @return: an array of integers
	 */
	public int[] printZMatrix(int[][] matrix) {
		int[] array = new int[matrix.length * matrix[0].length];
		int i = 0, j = 0;

		return array;
	}

	public static void main(String[] args) {
		MatrixZigzagTraversal instance = new MatrixZigzagTraversal();
		System.out.println(Arrays.toString(instance.printZMatrix(MATRIX)));
	}

}
