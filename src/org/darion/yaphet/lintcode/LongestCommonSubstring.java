package org.darion.yaphet.lintcode;

public class LongestCommonSubstring {
    public int longestCommonSubstring(String A, String B) {
        int[][] array = new int[A.length() + 1][B.length() + 1];
        for (int i = 0; i < A.length(); i++) {
            array[i][0] = 0;
        }
        for (int i = 0; i < B.length(); i++) {
            array[0][i] = 0;
        }

        int result = 0;
        for (int i = 0; i < A.length(); i++) {
            for (int j = 0; j < B.length(); j++) {
                if (A.charAt(i) == B.charAt(j)) {
                    array[i + 1][j + 1] = array[i][j] + 1;
                } else {
                    array[i + 1][j + 1] = Math.max(array[i][j + 1], array[i + 1][j]);
                }
                if (array[i + 1][j + 1] > result) {
                    result = array[i + 1][j + 1];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        LongestCommonSubstring instance = new LongestCommonSubstring();
//        System.out.println(instance.longestCommonSubstring("ABCD", "CBCE"));

        System.out.println(instance.longestCommonSubstring("www.lintcode.com code", "www.ninechapter.com code"));
    }
}
