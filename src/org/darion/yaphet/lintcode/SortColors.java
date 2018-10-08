package org.darion.yaphet.lintcode;

import java.util.Arrays;

/**
 * http://www.lintcode.com/zh-cn/problem/sort-colors/
 */
public class SortColors {
    public static void sortColors(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {0, 2, 2, 2, 2, 1, 0, 1, 0, 0, 0, 1, 0, 2, 0};
        sortColors(array);
        System.out.println(Arrays.toString(array));
    }
}
