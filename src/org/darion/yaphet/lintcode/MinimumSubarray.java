package org.darion.yaphet.lintcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * http://www.lintcode.com/zh-cn/problem/minimum-subarray/
 */
public class MinimumSubarray {
    public int minSubArray(List<Integer> nums) {
        if (nums == null || nums.size() == 0) {
            return 0;
        }

        int[] results = new int[nums.size()];
        results[0] = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if ((nums.get(i) + results[i - 1]) < nums.get(i)) {
                results[i] = nums.get(i) + results[i - 1];
            } else {
                results[i] = nums.get(i);
            }
        }

        int result = results[0];
        for (int i = 1; i < results.length; i++) {
            if (result > results[i]) {
                result = results[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {1, -1, -2, 1};
        List<Integer> nums = new LinkedList<>();
        for (Integer i : array) {
            nums.add(i);
        }

        MinimumSubarray instance = new MinimumSubarray();
        System.out.println(instance.minSubArray(nums));
    }
}
