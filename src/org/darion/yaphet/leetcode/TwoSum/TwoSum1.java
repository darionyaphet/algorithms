package org.darion.yaphet.leetcode.TwoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/two-sum/
 */
public class TwoSum1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int index = 0; index < nums.length; index++) {
            map.put(nums[index], index);
        }

        for (int index = 0; index < nums.length; index++) {
            int remain = target - nums[index];
            if (map.containsKey(remain) && !map.get(remain).equals(index)) {
                return new int[]{index, map.get(remain)};
            }
        }
        return new int[]{0, 0};
    }

    public static void main(String[] args) {
        TwoSum1 instance = new TwoSum1();
        //int[] numbers = {2, 7, 11, 15};
        //int[] numbers = {0, 4, 3, 0};
        int[] numbers = {3, 2, 4};
        System.out.println(Arrays.toString(instance.twoSum(numbers, 6)));
    }
}
