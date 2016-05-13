package org.darion.yaphet.leetcode;

/**
 * https://leetcode.com/problems/valid-sudoku/
 */
public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        int size = board.length;
        for (int row = 0; row < size; row++) {
            int[] array = new int[size + 1];

            for (int column = 0; column < size; column++) {
                char value = board[row][column];
                if ('.' == value) {
                    continue;
                }
                int index = value - 48;
                if (array[index] == 0) {
                    array[index] = 1;
                } else {
                    return false;
                }
            }
        }

        for (int column = 0; column < size; column++) {
            char[] array = new char[size + 1];
            for (int row = 0; row < size; row++) {
                char value = board[row][column];
                if ('.' == value) {
                    continue;
                }
                int index = value - 48;
                if (array[index] == 0) {
                    array[index] = 1;
                } else {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        char[][] board = new char[9][9];
//        String[] array = {
//                ".87654321",
//                "2........",
//                "3........",
//                "4........",
//                "5........",
//                "6........",
//                "7........",
//                "8........",
//                "9........"};

        String[] array = {
                "....5..1.",
                ".4.3.....",
                ".....3..1",
                "8......2.",
                "..2.7....",
                ".15......",
                ".....2...",
                ".2.9.....",
                "..4......"};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length(); j++) {
                board[i][j] = array[i].charAt(j);
            }
        }

        for (int row = 0; row < board.length; row++) {
            System.out.println(board[row]);
        }

//        ValidSudoku instance = new ValidSudoku();
//        System.out.println(instance.isValidSudoku(board));
    }
}
