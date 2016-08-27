package org.darion.yaphet.lintcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * http://www.lintcode.com/zh-cn/problem/intersection-of-two-arrays-ii/
 */
public class IntersectionOfTwoArraysII {
    /**
     * @param nums1 an integer array
     * @param nums2 an integer array
     * @return an integer array
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0) {
            return new int[0];
        }

        HashMap<Integer, Integer> source = new HashMap<>();
        for (int i : nums1) {
            if (source.containsKey(i)) {
                int val = source.get(i) + 1;
                source.put(i, val);
            } else {
                source.put(i, 1);
            }
        }

        List<Integer> list = new LinkedList<>();

        for (int index = 0; index < nums2.length; index++) {
            if (source.containsKey(nums2[index]) && source.get(nums2[index]) > 0) {
                list.add(nums2[index]);
                source.put(nums2[index], source.get(nums2[index]) - 1);
            }
        }

        int[] result = new int[list.size()];
        for (int index = 0; index < list.size(); index++) {
            result[index] = list.get(index);
        }
        return result;
    }

    public static void main(String[] args) {
//        int[] nums1 = {1, 2, 2, 1};
//        int[] nums2 = {2, 2};

        int[] nums1 = {4, 7, 9, 7, 6, 7};
        int[] nums2 = {5, 0, 0, 6, 1, 6, 2, 2, 4};

        IntersectionOfTwoArraysII instance = new IntersectionOfTwoArraysII();
        System.out.println(Arrays.toString(instance.intersection(nums1, nums2)));
    }
}
