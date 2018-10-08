package org.darion.yaphet.lintcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {
    public static List<List<Integer>> subsets(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i <= nums.length; i++) {
            List<Integer> item = new ArrayList<>();
            dfs(nums, 0, i, item, result);
        }
        return result;
    }

    public static void dfs(int[] nums, int start, int size, List<Integer> item, List<List<Integer>> result) {
        if (item.size() == size) {
            result.add(new ArrayList<>(item));
            return;
        }

        for (int i = start; i < nums.length; i++) {
            item.add(nums[i]);
            dfs(nums, i + 1, size, item, result);
            item.remove(item.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        System.out.println(subsets(array));
    }
}
