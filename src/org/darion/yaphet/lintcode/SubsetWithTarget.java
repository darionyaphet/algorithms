package org.darion.yaphet.lintcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SubsetWithTarget {
//    public long subsetWithTarget(int[] nums, int target) {
//        Arrays.sort(nums);
//        List<List<Integer>> result = new LinkedList<>();
//
//        for (int i = 0; i <= nums.length; i++) {
//            List<Integer> item = new ArrayList<>();
//            helper(nums, 0, i, item, result);
//        }
//
//        int counter = 0;
//        for (List<Integer> l : result) {
//            if (l.size() == 0) {
//                continue;
//            }
//
//            int value = l.get(0) + l.get(l.size() - 1);
//            if (value < target) {
//                counter += 1;
//                System.out.println(l);
//            }
//        }
//        return counter;
//    }
//
//    private void helper(int[] nums, int start, int size, List<Integer> item, List<List<Integer>> result) {
//        if (item.size() == size) {
//            result.add(new ArrayList<>(item));
//            return;
//        }
//
//        for (int i = start; i < nums.length; i++) {
//            item.add(nums[i]);
//            helper(nums, i + 1, size, item, result);
//            item.remove(item.size() - 1);
//        }
//    }

    public long subsetWithTarget(int[] nums, int target) {
        Arrays.sort(nums);
        long sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] * 2 < target) {
                sum += 1;
            }

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] < target) {
                    sum += Math.pow(2, j - i - 1);
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 2, 4, 3};
//        int[] array = {41, 6467, 6334, 2500, 7169, 3724, 11478, 5358, 2962, 464, 5705, 4145, 11281, 4827, 9961, 491, 2995, 11942, 4827, 5436};
        SubsetWithTarget instance = new SubsetWithTarget();
        System.out.println(instance.subsetWithTarget(array, 5));
    }
}
