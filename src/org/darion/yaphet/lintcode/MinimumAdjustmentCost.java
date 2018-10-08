package org.darion.yaphet.lintcode;

import java.util.Arrays;
import java.util.List;

public class MinimumAdjustmentCost {
    public static int MinAdjustmentCost(List<Integer> A, int target) {
        for (int i = 1; i < A.size() - 1; i++) {
            int previous = A.get(i - 1);
            int next = A.get(i + 1);
        }
        return -1;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 4, 2, 3);
        System.out.println(MinAdjustmentCost(list, 1));
    }
}
