package org.darion.yaphet.lintcode;

public class NQueensII {
    private int total = 0;
    private int[] array;

    public int totalNQueens(int n) {
        array = new int[n];
        totalNQueens(0, n);
        return total;
    }

    private boolean judge(int row) {
        for (int i = 0; i < row; i++) {
            if (array[i] == array[row]) {
                return false;
            }

            if (Math.abs(row - i) == Math.abs(array[row] - array[i])) {
                return false;
            }
        }
        return true;
    }

    private void totalNQueens(int row, int number) {
        if (row == number) {
            total += 1;
            return;
        }

        for (int column = 0; column < number; column++) {
            array[row] = column;
            if (judge(row)) {
                totalNQueens(row + 1, number);
            }
        }
    }

    public static void main(String[] args) {
        NQueensII instance = new NQueensII();
        System.out.println(instance.totalNQueens(8));
    }
}
