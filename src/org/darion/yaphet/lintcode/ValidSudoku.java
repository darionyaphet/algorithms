package org.darion.yaphet.lintcode;

import java.util.Arrays;

/**
 * http://www.lintcode.com/zh-cn/problem/valid-sudoku/
 * 
 * @author darion.yaphet
 * 
 */
public class ValidSudoku {
	/**
	 * @param board
	 *            : the board
	 * @return: wether the Sudoku is valid
	 */
	public boolean isValidSudoku(char[][] board) {
		if (board == null) {
			return false;
		}

		int size = board.length;
		for (char[] row : board) {
			if (row.length != size) {
				return false;
			}
		}

		final int SIZE = board.length;
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				// System.out.println(i + "  " + j);
				char element = board[i][j];

				if ('.' == element) {
					continue;
				}

				for (int k = 0; k < SIZE; k++) {
					// System.out.println("K " + k);
					if ('.' != board[i][k] && element == board[i][k]) {
						if (k == j) {
							continue;
						}
						// System.out.println(1);
						return false;
					}

					if ('.' != board[k][j] && element == board[k][j]) {
						if (k == i) {
							continue;
						}
						// System.out.println(2);
						return false;
					}
				}
			}
		}

		return true;
	}

	public static void main(String[] args) {
		String[] array = { ".87654321", "2........", "3........", "4........",
				"5........", "6........", "7........", "8........", "9........" };

		char[][] board = new char[9][9];

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				board[i][j] = array[i].charAt(j);
			}
		}

		for (int index = 0; index < 9; index++) {
			System.out.println(Arrays.toString(board[index]));
		}

		ValidSudoku instance = new ValidSudoku();
		System.out.println(instance.isValidSudoku(board));
		// boolean[] founded = new boolean[9];
		// System.out.println(Arrays.toString(founded));
	}
}
