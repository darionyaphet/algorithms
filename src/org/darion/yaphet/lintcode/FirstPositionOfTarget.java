package org.darion.yaphet.lintcode;

/**
 * http://www.lintcode.com/zh-cn/problem/first-position-of-target/
 */
public class FirstPositionOfTarget {
    public static int binarySearch(int[] nums, int target) throws InterruptedException {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int middle = (low + high) / 2;

            if (nums[middle] == target) {
                for (int index = middle - 1; index >= 0; index--) {
                    if (nums[index] == target) {
                        middle = index;
                    } else {
                        break;
                    }
                }
                return middle;
            } else if (nums[middle] > target) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) throws InterruptedException {
        int[] array = {1, 2, 3, 3, 4, 5, 10};
        System.out.println(binarySearch(array, 3));
    }
}
