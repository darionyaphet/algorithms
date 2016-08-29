package org.darion.game;

import java.util.Arrays;

/**
 * https://en.wikipedia.org/wiki/Eight_queens_puzzle
 */
public class EightQueens {
    private static boolean[][] CHESSBOARD = new boolean[8][8];

    private void printChessBoard() {
        for (int i = 0; i < 8; i++) {
            System.out.println(Arrays.toString(CHESSBOARD[i]));
        }
    }

    public static void main(String[] args) {
        
    }
}
