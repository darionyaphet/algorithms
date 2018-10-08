package org.darion.yaphet.examples;

import java.util.ArrayList;
import java.util.Arrays;

public class Subsets {
    public ArrayList<ArrayList<Integer>> subsets(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length == 0)
            return res;

        Arrays.sort(nums);
        helper(nums, 0, list, res);
        return res;
    }

    public void helper(int[] nums, int start, ArrayList<Integer> list, ArrayList<ArrayList<Integer>> res) {
        res.add(new ArrayList<>(list));
        System.out.println(res);
        for (int i = start; i < nums.length; i++) {
            if (list.contains(nums[i])) {
                continue;
            }

            list.add(nums[i]);
//            System.out.println(list);
            helper(nums, i + 1, list, res);
            list.remove(list.size() - 1);
//            System.out.println(list);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        Subsets instance = new Subsets();
        System.out.println(instance.subsets(array));
    }
}
