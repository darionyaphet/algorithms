package org.darion.yaphet.lintcode;

import java.util.LinkedList;
import java.util.List;

/**
 * http://www.lintcode.com/zh-cn/problem/n-queens/
 */
public class NQueens {

    private List<List<String>> result = new LinkedList<>();
    private int[] array;

    public List<List<String>> solveNQueens(int n) {
        array = new int[n];
        nQueens(0, n);
        return result;
    }

    private boolean judge(int n) {
        for (int i = 0; i < n; i++) {
            if (array[i] == array[n]) {
//                System.out.println("Column Conflict " + array[i] + ":" + array[n]);
                return false;
            }

            if (Math.abs(n - i) == Math.abs(array[n] - array[i])) {
//                System.out.println("Diagonal Conflict " + i + ":" + array[i] + "\t" + n + ":" + array[n]);
                return false;
            }
        }
        return true;
    }

    private void print() {
        List<String> list = new LinkedList<>();

        for (int i = 0; i < array.length; i++) {
            StringBuffer buffer = new StringBuffer();
            for (int j = 0; j < array.length; j++) {
                if (j != array[i]) {
                    buffer.append(".");
                } else {
                    buffer.append("Q");
                }
            }
            list.add(buffer.toString());
        }
        result.add(list);
    }

    private void nQueens(int row, int n) {
        if (row == n) {
            print();
            return;
        }

        for (int column = 0; column < n; column++) {
//            System.out.println("Begin test Row : " + row + " Column : " + column);
            array[row] = column;
            if (judge(row)) {
//                System.out.println("Check Success Row : " + row);
                nQueens(row + 1, n);
            } else {
//                System.out.println("Check Failed Row : " + row);
            }
        }
    }

    public static void main(String[] args) {
        NQueens instance = new NQueens();
        System.out.println(instance.solveNQueens(4));
    }
}
