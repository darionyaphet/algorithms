package org.darion.yaphet.lintcode;

import java.util.Arrays;

public class JumpGame {
//    public boolean canJump(int[] A) {
//        int currentMaxStep = A[0];
//        for (int i = 1; i < A.length; i++) {
//            if (i > currentMaxStep) {
//                return false;
//            }
//
//            currentMaxStep = Math.max(currentMaxStep, i + A[i]);
//            if (currentMaxStep >= A.length - 1) {
//                return true;
//            }
//        }
//        return currentMaxStep >= A.length - 1;
//    }

    public boolean canJump(int[] A) {
        if (A.length == 1) {
            return true;
        }

        int[] dp = new int[A.length];
        dp[0] = A[0];
        for (int i = 1; i < A.length; i++) {
            if (dp[i - 1] >= i) {
                dp[i] = Math.max(i + A[i], dp[i - 1]);
            } else {
                dp[i] = 0;
            }
        }

        System.out.println(Arrays.toString(dp));
        return dp[dp.length - 1] >= A.length - 1;
    }

    public static void main(String[] args) {
//        int[] array = {2, 3, 1, 1, 4};
//        int[] array = {3, 2, 1, 0, 4};
        int[] array = {1, 0};
        JumpGame instance = new JumpGame();
        System.out.println(instance.canJump(array));
    }
}
