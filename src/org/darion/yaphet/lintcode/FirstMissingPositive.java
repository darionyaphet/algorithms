package org.darion.yaphet.lintcode;

import java.util.HashSet;
import java.util.Set;

/**
 * http://www.lintcode.com/zh-cn/problem/first-missing-positive/
 */
public class FirstMissingPositive {

    public static int firstMissingPositive(int[] A) {
        if (A == null) {
            return -1;
        }

        if (A.length == 0) {
            return 1;
        }

        Set<Integer> set = new HashSet<>();
        for (int element : A) {
            if (element <= 0) {
                continue;
            }
            set.add(element);
        }

        for (int i = 1; ; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 0};
        System.out.println(firstMissingPositive(array));
    }
}
