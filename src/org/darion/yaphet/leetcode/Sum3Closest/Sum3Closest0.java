package org.darion.yaphet.leetcode.Sum3Closest;

/**
 * https://leetcode.com/problems/3sum-closest/
 */
public class Sum3Closest0 {

    public int threeSumClosest(int[] nums, int target) {

        int r0, r1, r2;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                for (int k = j; k < nums.length; k++) {

                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Sum3Closest0 instance = new Sum3Closest0();
        System.out.println(instance.threeSumClosest(new int[]{-1, 2, 1, -4}, 1));
    }
}
