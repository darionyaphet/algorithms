package org.darion.yaphet.lintcode;

import java.util.Arrays;

/**
 * http://www.lintcode.com/zh-cn/problem/merge-two-sorted-arrays/
 */
public class MergeTwoSortedArrays {
    public static int[] mergeSortedArray(int[] A, int[] B) {
        if (A == null || A.length == 0) {
            return B;
        }

        if (B == null || B.length == 0) {
            return A;
        }

        int size = A.length + B.length;
        int[] result = new int[size];

        int i = 0, j = 0, position = 0;
        for (; i < A.length && j < B.length; position++) {
            if (A[i] <= B[j]) {
                result[position] = A[i];
                i++;
            } else {
                result[position] = B[j];
                j++;
            }
        }

        if (i < A.length) {
            System.out.println("A " + i);
            for (; i < A.length; i++, position++) {
                result[position] = A[i];
            }
        } else if (j < B.length) {
            System.out.println("B " + j);
            for (; j < B.length; j++, position++) {
                result[position] = B[j];
            }
        } else {

        }

        return result;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {2, 4, 5, 6};
        System.out.println(Arrays.toString(mergeSortedArray(a, b)));
    }
}
