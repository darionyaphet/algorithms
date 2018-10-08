package org.darion.yaphet.lintcode;

import java.util.Arrays;

/**
 * http://www.lintcode.com/zh-cn/problem/search-a-2d-matrix/
 */
public class Search2DMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }

        int columnLastIndex = matrix[0].length - 1;

        if (target <= matrix[0][columnLastIndex]) {
            for (int column = 0; column <= columnLastIndex; column++) {
                if (matrix[0][column] == target) {
                    return true;
                }
            }
        }

        for (int row = 1; row < matrix.length; row++) {
            if (matrix[row][columnLastIndex] >= target && matrix[row - 1][columnLastIndex] < target) {
                for (int column = 0; column <= columnLastIndex; column++) {
                    if (matrix[row][column] == target) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}};
        System.out.println(searchMatrix(matrix, 30));
    }
}
