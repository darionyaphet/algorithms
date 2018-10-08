package org.darion.yaphet.lintcode;

public class ClassicalBinarySearch {
    public int findPosition(int[] nums, int target) {
        int low = 0, hight = nums.length - 1;

        while (low < hight) {
            int middle = (low + hight) / 2;
            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] < target) {
                low = middle + 1;
            } else {
                hight = middle - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 2, 4, 5, 5};
        ClassicalBinarySearch instance = new ClassicalBinarySearch();
        System.out.println(instance.findPosition(array, 6));
    }
}
