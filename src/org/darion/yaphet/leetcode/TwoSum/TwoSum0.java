package org.darion.yaphet.leetcode.TwoSum;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/two-sum/
 */
public class TwoSum0 {
    public int[] twoSum(int[] nums, int target) {
        int[] result = {0, 0};
        if (nums == null || nums.length == 1) {
            return result;
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        TwoSum0 instance = new TwoSum0();
        int[] numbers = {2, 7, 11, 15};
        System.out.println(Arrays.toString(instance.twoSum(numbers, 9)));
    }
}
