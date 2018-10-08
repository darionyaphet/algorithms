package org.darion.yaphet.lintcode;

import java.util.Arrays;

/**
 * http://www.lintcode.com/zh-cn/problem/maximum-subarray/
 */
public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int[] results = new int[nums.length];
        results[0] = nums[0];

        for (int index = 1; index < nums.length; index++) {
            if ((nums[index] + results[index - 1]) > nums[index]) {
                results[index] = (nums[index] + results[index - 1]);
            } else {
                results[index] = nums[index];
            }
        }

//        System.out.println(Arrays.toString(results));
        int result = results[0];
        for (int index = 1; index < nums.length; index++) {
            if (result < results[index]) {
                result = results[index];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {-2, 2, -3, 4, -1, 2, 1, -5, 3};
        MaximumSubarray instance = new MaximumSubarray();
        System.out.println(instance.maxSubArray(array));
    }
}
