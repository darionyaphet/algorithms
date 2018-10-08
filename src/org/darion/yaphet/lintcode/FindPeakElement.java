package org.darion.yaphet.lintcode;

public class FindPeakElement {
    public int findPeak(int[] A) {
        if (A == null || A.length == 0) {
            return -1;
        }

        for (int index = 1; index < A.length - 1; index++) {
            if (A[index] > A[index - 1] && A[index] > A[index + 1]) {
                return index;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 1, 3, 4, 5, 7, 6};
        FindPeakElement instance = new FindPeakElement();
        System.out.println(instance.findPeak(array));
    }
}
