package org.darion.yaphet.lintcode;


import java.util.Arrays;

public class KthLargestElement {
    public static int kthLargestElement(int k, int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        if (k <= 0) {
            return -1;
        }
        for (int i = 0; i < k; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    int tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                }
            }
        }

        //boolean isBigger = k > nums.length / 2 ? true : false;



        java.util.Arrays.sort(nums);
        return nums[nums.length - k];
    }


//    public int quickSort(int[] nums, int start, int end, int k) {
//        int low = start;
//        int high = end;
//        int tmp = nums[low];
//
//        while (low < high) {
//            while (low < high && tmp >= nums[high]) {
//                high -= 1;
//            }
//
//            if (low < high) {
//
//            }
//        }
//    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 8, 9, 10, 7};
        System.out.println(kthLargestElement(10, array));
    }
}
