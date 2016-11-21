package org.darion.yaphet.Dynamic.Programming.LCS;

public class LongestCommonSubString {
    public static void main(String[] args) {
        final String s0 = "ABCBDAB";
        final String s1 = "BDCABA";

        int[][] matrix = new int[s0.length() + 1][s1.length() + 1];

        for (int i = 1; i <= s0.length(); i++) {
            for (int j = 1; j <= s1.length(); j++) {
                if (s0.charAt(i - 1) == s1.charAt(j - 1)) {
                    matrix[i][j] = matrix[i - 1][j - 1] + 1;
                } else {
                    if (matrix[i][j - 1] > matrix[i - 1][j]) {
                        matrix[i][j] = matrix[i][j - 1];
                    } else {
                        matrix[i][j] = matrix[i - 1][j];
                    }
                }
            }
        }

        for (int i = 1; i <= s0.length(); i++) {
            for (int j = 1; j <= s1.length(); j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


        StringBuilder builder = new StringBuilder();
        for (int i = s0.length(), j = s1.length(); i >= 1 && j >= 1; ) {
            if (s0.charAt(i - 1) == s1.charAt(j - 1)) {
                builder.append(s0.charAt(i - 1));
                i--;
                j--;
            } else {
                if (matrix[i][j - 1] >= matrix[i - 1][j]) {
                    j--;
                } else {
                    i--;
                }
            }
        }

        System.out.println(builder.reverse().toString());
    }
}
