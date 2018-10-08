package org.darion.yaphet.lintcode;

import java.util.Arrays;

public class MergeSortedArray {
    public static void mergeSortedArray(int[] A, int m, int[] B, int n) {
        int[] result = new int[A.length];
        int i = 0, j = 0, p = 0;
        while (i < m && j < n) {
            if (A[i] < B[j]) {
                result[p++] = A[i++];
            } else {
                result[p++] = B[j++];
            }
        }

//        System.out.println(i + " " + j);
        if (i < m) {
            for (int k = i; k < m; k++) {
//                System.out.println("K " + k);
                result[p++] = A[k];
            }
        }

        if (j < n) {
            for (int k = j; k < n; k++) {
//                System.out.println(" K " + k);
                result[p++] = B[k];
            }
        }

        for (int index = 0; index < A.length; index++) {
            A[index] = result[index];
        }
    }

    public static void main(String[] args) {
        int[] A = new int[5];
        A[0] = 1;
        A[1] = 2;
        A[2] = 3;
        int[] B = {4, 5};
        System.out.println(Arrays.toString(A));
        mergeSortedArray(A, 3, B, 2);
        System.out.println(Arrays.toString(A));

    }
}
