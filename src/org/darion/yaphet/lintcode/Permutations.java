package org.darion.yaphet.lintcode;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            result.add(new ArrayList<>());
            return result;
        }

        helper(nums, list, result);
        return result;
    }

    public void helper(int[] nums, List<Integer> list, List<List<Integer>> res) {
        if (list.size() == nums.length) {
            res.add(new ArrayList<>(list));
            System.out.println(res);
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (list.contains(nums[i])) {
                continue;
            }
            list.add(nums[i]);
            helper(nums, list, res);
            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
//        int[] array = {};
        Permutations instance = new Permutations();
        System.out.println(instance.permute(array));
    }
}
