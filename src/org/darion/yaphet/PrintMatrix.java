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
		String[] result = new String[3];

		final int dimensions = 3;
		int[][] matrix = new int[dimensions][dimensions];
		for (int index = 0; index < dimensions * dimensions; index++) {
			int row = index / dimensions;
			int column = index % dimensions;
			matrix[row][column] = index + 1;
		}

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}

			System.out.println();
		}
	}
}
