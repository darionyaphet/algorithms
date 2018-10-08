package org.darion.yaphet.lintcode;

import java.util.Arrays;

public class SearchForARange {
    public int[] searchRange(int[] A, int target) {
        int[] array = new int[2];
        int start = -1, end = -1;
        if (A == null || A.length == 0) {
            array[0] = start;
            array[1] = end;
            return array;
        }

        for (int index = 0; index < A.length; index++) {
            if (A[index] == target) {
                start = index;
                end = index;
                break;
            }
        }

        for (int index = start + 1; index < A.length; index++) {
            if (A[index] == target) {
                end = index;
            }
        }
        array[0] = start;
        array[1] = end;
        return array;
    }

    public static void main(String[] args) {
//        int[] array = {5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
//        int[] array = null;
        int[] array = {1, 3, 5, 6, 8, 9};
        SearchForARange instance = new SearchForARange();
        System.out.println(Arrays.toString(instance.searchRange(array, 7)));
    }
}
