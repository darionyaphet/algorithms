package org.darion.yaphet.lintcode;

public class SpiralArray {
    public int[][] spiralArray(int n) {
        int[][] array = new int[n][n];

        int i = 0, j = 0;
        int iDiff = 0, jDiff = 0;
        int t = 0, b = n - 1, l = 0, r = n - 1;

        for (int index = 0; index < n * n; index++) {
            array[i][j] = index;
            if (i < n && j < n) {
                i += iDiff;
                j += jDiff;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        SpiralArray instance = new SpiralArray();
        System.out.println(instance.spiralArray(3));
    }
}
