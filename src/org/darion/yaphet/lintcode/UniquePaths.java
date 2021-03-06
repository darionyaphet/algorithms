package org.darion.yaphet.lintcode;

/**
 * http://www.lintcode.com/zh-cn/problem/unique-paths/
 */
public class UniquePaths {
    public int uniquePaths(int m, int n) {
        if (m <= 0 || n <= 0) {
            return -1;
        }

        int[][] result = new int[m][n];
        for (int index = 0; index < m; index++) {
            result[index][0] = 1;
        }

        for (int index = 0; index < n; index++) {
            result[0][index] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                result[i][j] = result[i - 1][j] + result[i][j - 1];
            }
        }

        return result[m - 1][n - 1];
    }

    public static void main(String[] args) {
        UniquePaths instance = new UniquePaths();
        System.out.println(instance.uniquePaths(3, 3));
        System.out.println(instance.uniquePaths(4, 5));
    }
}
