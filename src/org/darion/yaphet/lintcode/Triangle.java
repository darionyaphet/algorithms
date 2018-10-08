package org.darion.yaphet.lintcode;

/**
 * http://www.lintcode.com/zh-cn/problem/triangle/
 */
public class Triangle {
    public static int minimumTotal(int[][] triangle) {
        int column = triangle[0].length;
        int[] results = new int[column];

        int result = results[0];
        for (int i = 1; i < results.length; i++) {
            if (result > results[i]) {
                result = results[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(minimumTotal(null));
    }
}
