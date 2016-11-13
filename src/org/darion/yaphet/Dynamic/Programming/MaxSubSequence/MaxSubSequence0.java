package org.darion.yaphet.Dynamic.Programming.MaxSubSequence;

public class MaxSubSequence0 {
    private static int maxSubSequence(int[] array) {
        int size = array.length;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                int currentSum = 0;
                for (int k = i; k < j; k++) {
                    currentSum += array[k];
                }
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        System.out.println(maxSubSequence(new int[]{-2, 11, -4, 13, -5, -2}));
    }
}
