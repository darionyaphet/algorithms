package org.darion.yaphet.lintcode;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int pointer = 1;
        int count = 0;
        for (int index = 1; index < nums.length; ++index) {
            if (nums[index] == nums[pointer - 1]) {
                count++;
                if (count >= 2)
                    continue;
            } else {
                count = 0;
            }
            nums[pointer] = nums[index];
            pointer++;
        }
        return pointer;
    }

    public static void main(String[] args) {
        int[] array = {1, 1, 1, 1, 2};
        RemoveDuplicatesFromSortedArrayII instance = new RemoveDuplicatesFromSortedArrayII();
        System.out.println(instance.removeDuplicates(array));
    }
}
