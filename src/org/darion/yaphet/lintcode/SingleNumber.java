package org.darion.yaphet.lintcode;

import java.util.Arrays;

/**
 * http://www.lintcode.com/zh-cn/problem/single-number/
 */
public class SingleNumber {
    public static int singleNumber(int[] A) {
        if (A == null || A.length == 0) {
            return -1;
        }
        Arrays.sort(A);
        for (int i = 0; i < A.length; i += 2) {

            if (i == A.length - 1) {
                return A[i];
            } else if (A[i] != A[i + 1]) {
                return A[i];
            } else {

            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 2, 1, 3, 4, 3};
        System.out.println(singleNumber(array));
    }
}
