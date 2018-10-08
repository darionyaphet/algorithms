package org.darion.yaphet.examples;

public class LCS {
    public int findLCS(String A, String B) {
        int[][] array = new int[A.length() + 1][B.length() + 1];
        for (int i = 1; i < A.length() + 1; i++) {
            for (int j = 1; j < B.length() + 1; j++) {
                if (A.charAt(i - 1) == B.charAt(j - 1)) {
                    array[i][j] = array[i - 1][j - 1] + 1;
                } else {
                    array[i][j] = Math.max(array[i][j - 1], array[i - 1][j]);
                }
            }
        }

        for (int i = 1; i < A.length() + 1; i++) {
            for (int j = 1; j < B.length() + 1; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        return array[A.length()][B.length()];
    }

    public static void main(String[] args) {
        LCS instance = new LCS();
        System.out.println(instance.findLCS("1A2C3D4B56", "B1D23CA45B6A"));
    }
}  