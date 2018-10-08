package org.darion.yaphet.lintcode;

import java.util.Arrays;

public class MaximumProductSubarray {
//    public int maxProduct(int[] nums) {
//        int[] result = new int[nums.length];
//        result[0] = nums[0];
//
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] * result[i - 1] <= 0) {
//                result[i] = nums[i];
//            } else {
//                result[i] = nums[i] * result[i - 1];
//            }
//        }
//
//        System.out.println(Arrays.toString(result));
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < result.length; i++) {
//            if (result[i] > max) {
//                max = result[i];
//            }
//        }
//        return max;
//    }

    public int maxProduct(int[] nums) {
        int posmax = nums[0], negmax = nums[0], max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int tempPosMax = posmax;
            int tempNegMax = negmax;
            posmax = Math.max(nums[i], Math.max(nums[i] * tempPosMax, nums[i] * tempNegMax));
            negmax = Math.min(nums[i], Math.min(nums[i] * tempPosMax, nums[i] * tempNegMax));
            if (Math.max(posmax, negmax) > max) {
                max = Math.max(posmax, negmax);
            }

            System.out.println("Max : " + max + " pos Max : " + posmax + " neg Max : " + negmax);
        }
        return max;
    }

    public static void main(String[] args) {
//        int[] array = {2, 3, -2, 4};
//        int[] array = {-4, -3};
        int[] array = {1, 0, -1, 2, 3, -5, -2};
        MaximumProductSubarray instance = new MaximumProductSubarray();
        System.out.println(instance.maxProduct(array));
    }
}
