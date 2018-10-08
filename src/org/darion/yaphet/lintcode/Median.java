package org.darion.yaphet.lintcode;


/**
 * http://www.lintcode.com/zh-cn/problem/median/
 */
public class Median {

    public static int median(int[] nums) {
        java.util.Arrays.sort(nums);
        if (nums.length % 2 == 0) {
            return nums[nums.length / 2 - 1];
        } else {
            return nums[nums.length / 2];
        }
    }

    public static void main(String[] args) {
        int[] array = {4, 5, 1, 2, 3};
        System.out.println(median(array));
    }
}
