package org.darion.yaphet.lintcode;


import java.util.Arrays;

public class ValidSudoku {
    public static boolean isValidSudoku(char[][] board) {
        if (board == null) {
            return false;
        }

        for (int i = 0; i < 9; i++) {
            boolean[] flags = new boolean[10];
            for (int j = 0; j < 9; j++) {
                if ('.' == board[i][j]) {
                    continue;
                }
                int index = board[i][j] - 48;
                if (!flags[index]) {
                    flags[index] = true;
                } else {
                    return false;
                }
            }
        }

        for (int j = 0; j < 9; j++) {
            boolean[] flags = new boolean[10];
            for (int i = 0; i < 9; i++) {
                if ('.' == board[i][j]) {
                    continue;
                }

                int index = board[i][j] - 48;
                if (!flags[index]) {
                    flags[index] = true;
                } else {
                    return false;
                }
            }
        }

        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                boolean[] flags = new boolean[10];
                for (int k = 0; k < 9; k++) {
                    if (board[i + k / 3][j + k % 3] == '.') {
                        continue;
                    }

                    int num = board[i + k / 3][j + k % 3] - '0';
                    if (num < 1 || num > 9 || flags[num - 1]) {
                        return false;
                    } else {
                        flags[num - 1] = true;
                    }
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
//
//                "....5..1.",
//                ".4.3.....",
//                ".....3..1",
//                "8......2.",
//                "..2.7....",
//                ".15......",
//                ".....2...",
//                ".2.9.....",
//                "..4......"

        char[][] array = {
                {'.', '.', '.', '.', '5', '.', '.', '1', '.'},
                {'.', '4', '.', '3', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '3', '.', '.', '1'},
                {'8', '.', '.', '.', '.', '.', '.', '2', '.'},
                {'.', '.', '2', '.', '7', '.', '.', '.', '.'},
                {'.', '1', '5', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '2', '.', '.', '.'},
                {'.', '2', '.', '9', '.', '.', '.', '.', '.'},
                {'.', '.', '4', '.', '.', '.', '.', '.', '.'}
        };
        System.out.println(isValidSudoku(array));
    }
}
