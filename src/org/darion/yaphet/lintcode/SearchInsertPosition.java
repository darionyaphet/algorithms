package org.darion.yaphet.lintcode;

public class SearchInsertPosition {
    public static int searchInsert(int[] A, int target) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] == target) {
                return i;
            } else if (A[i] < target) {
            } else {
                return i;
            }
        }
        return A.length;
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 6};
        System.out.println(searchInsert(array, 0));
    }
}
