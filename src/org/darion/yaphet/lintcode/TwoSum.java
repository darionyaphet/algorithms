package org.darion.yaphet.lintcode;

import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] numbers, int target) {
        if (numbers == null || numbers.length == 0) {
            return null;
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    int[] result = {i, j};
                    return result;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] array = {0, 4, 3, 0};
        System.out.println(Arrays.toString(twoSum(array, 0)));
    }
}
