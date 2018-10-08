package org.darion.yaphet.lintcode;

import java.util.Arrays;

/**
 * https://www.lintcode.com/zh-cn/problem/remove-duplicates-from-sorted-array/
 */
public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int counter = 1;
        for (int index = 1; index < nums.length; index++) {
            if (nums[index] != nums[index - 1]) {
                nums[counter++] = nums[index];
            }
        }
        System.out.println(Arrays.toString(nums));
        return counter;
    }

    public static void main(String[] args) {
        int[] array = {1, 1, 2};
        RemoveDuplicatesFromSortedArray instance = new RemoveDuplicatesFromSortedArray();
        System.out.println(instance.removeDuplicates(array));
    }
}
