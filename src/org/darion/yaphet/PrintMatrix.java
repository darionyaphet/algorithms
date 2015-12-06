package org.darion.yaphet;

/**
 * 
 * 1 2 3
 * 
 * 4 5 6
 * 
 * 7 8 9
 * 
 * @author Darion.Yaphet
 *
 */
public class PrintMatrix {
	public static void main(String[] args) {
		final int dimensions = 3;
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		// for (int i = 0; i < dimensions; i++) {
		// for (int j = 0; j < dimensions; j++) {
		// System.out.print(matrix[i][j] + " ");
		// }
		// System.out.println();
		// }

		for (int row = 0; row < dimensions; row++) {
			StringBuilder builder = new StringBuilder();
			for (int column = 0; column < dimensions; column++) {
				for (int k = 0; k < dimensions; k++) {
					System.out.print(matrix[row][column] + " ");
				}
			}
			System.out.println();
		}
	}
}
