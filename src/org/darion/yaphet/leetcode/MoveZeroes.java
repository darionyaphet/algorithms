package org.darion.yaphet.leetcode;

import java.util.Arrays;

public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int end = nums.length - 1;
        for (int index = end; index >= 0; index--) {
            for (int j = index; j < end; j++) {

            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
