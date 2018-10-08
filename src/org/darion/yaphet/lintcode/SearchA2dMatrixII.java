package org.darion.yaphet.lintcode;

public class SearchA2dMatrixII {
    public int searchMatrix(int[][] matrix, int target) {
        int counter = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    counter += 1;
                } else if (matrix[i][j] > target) {
                    continue;
                }
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5, 7},
                {2, 4, 7, 8},
                {3, 5, 9, 10}
        };

        SearchA2dMatrixII instance = new SearchA2dMatrixII();
        System.out.println(instance.searchMatrix(matrix, 3));
    }
}
