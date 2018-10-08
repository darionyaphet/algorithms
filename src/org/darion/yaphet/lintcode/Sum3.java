package org.darion.yaphet.lintcode;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * http://www.lintcode.com/zh-cn/problem/3sum/
 */
public class Sum3 {

    public static List<List<Integer>> threeSum(int[] numbers) {
        List<List<Integer>> result = new LinkedList<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int value = numbers[i] + numbers[j];
                for (int k = j + 1; k < numbers.length; k++) {
                    if ((numbers[k] + value) == 0) {
                        List<Integer> list = new LinkedList<>();
                        System.out.println(i + " " + j + " " + k);
                        list.add(numbers[i]);
                        list.add(numbers[j]);
                        list.add(numbers[k]);
                        list.sort(Comparator.comparingInt(o -> o));
                        result.add(list);
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] array = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(array));
    }
}
