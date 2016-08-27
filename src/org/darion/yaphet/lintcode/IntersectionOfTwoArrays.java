package org.darion.yaphet.lintcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * http://www.lintcode.com/zh-cn/problem/intersection-of-two-arrays/
 */
public class IntersectionOfTwoArrays {
    /**
     * @param nums1 an integer array
     * @param nums2 an integer array
     * @return an integer array
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0) {
            return new int[0];
        }

        Set<Integer> source = new HashSet<>();
        Set<Integer> target = new HashSet<>();

        for (int i : nums1) {
            if (!source.contains(i)) {
                source.add(i);
            }
        }

        for (int i : nums2) {
            if (!target.contains(i)) {
                target.add(i);
            }
        }

        ArrayList<Integer> array = new ArrayList<>();

        for (int s : source) {
            if (target.contains(s)) {
                array.add(s);
            }
        }

        int[] result = new int[array.size()];
        for (int index = 0; index < array.size(); index++) {
            result[index] = array.get(index);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        IntersectionOfTwoArrays instance = new IntersectionOfTwoArrays();
        System.out.println(Arrays.toString(instance.intersection(nums1, nums2)));
    }
}
