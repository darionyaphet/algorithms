package org.darion.yaphet.leetcode.Sum3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode.com/problems/3sum/
 */
public class Sum3 {
    public List<List<Integer>> threeSum(int[] nums) {

        if (nums == null || nums.length == 0) {
            return new LinkedList<List<Integer>>();
        }

        Arrays.sort(nums);

        LinkedList result = new LinkedList<LinkedList<Integer>>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {

                        for (int index = 0; index < result.size(); index++) {
                            List list = (List) result.get(index);
                            if (list.get(0).equals(nums[i]) &&
                                    list.get(1).equals(nums[j]) &&
                                    list.get(2).equals(nums[k])) {
                                continue;
                            }
                        }

                        List part = new LinkedList();
                        part.add(nums[i]);
                        part.add(nums[j]);
                        part.add(nums[k]);
                        result.add(part);
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Sum3 instance = new Sum3();
        System.out.println(instance.threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }
}
