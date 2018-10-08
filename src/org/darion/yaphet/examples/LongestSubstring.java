package org.darion.yaphet.examples;

public class LongestSubstring {
    public int findLongest(String A, String B) {
        int[][] array = new int[A.length() + 1][B.length() + 1];
        int max = 0;
        for (int i = 1; i < A.length() + 1; i++) {
            for (int j = 1; j < B.length() + 1; j++) {
                if (A.charAt(i - 1) == B.charAt(j - 1)) {
                    array[i][j] = array[i - 1][j - 1] + 1;
                    max = Math.max(max, array[i][j]);
                } else {
                    array[i][j] = 0;
                }
            }
        }

        for (int i = 1; i < A.length() + 1; i++) {
            for (int j = 1; j < B.length() + 1; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        return max;
    }

    public static void main(String[] args) {
        LongestSubstring instance = new LongestSubstring();
        System.out.println(instance.findLongest("1AB2345CD", "12345EF"));
    }
}