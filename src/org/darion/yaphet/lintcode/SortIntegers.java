package org.darion.yaphet.lintcode;

import java.util.Arrays;

/**
 * http://www.lintcode.com/zh-cn/problem/sort-integers/
 */
public class SortIntegers {

    public void sortIntegers(int[] A) {
        if (A == null || A.length == 0) {
            return;
        }

        for (int i = 0; i < A.length; i++) {
            for (int j = i; j < A.length; j++) {
                if (A[i] > A[j]) {
                    int tmp = A[i];
                    A[i] = A[j];
                    A[j] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {3, 2, 1, 4, 5};
        SortIntegers instance = new SortIntegers();
        instance.sortIntegers(array);
        System.out.println(Arrays.toString(array));
    }
}
