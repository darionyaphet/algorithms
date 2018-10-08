package org.darion.yaphet.lintcode;

import java.util.Arrays;


public class JumpGameII {
    public int jump(int[] A) {
        int jumps = 0;
        int currentEnd = 0;
        int currentFarthest = 0;
        for (int i = 0; i < A.length - 1; ++i) {
            currentFarthest = Math.max(currentFarthest, i + A[i]);
            if (i == currentEnd) {
                jumps++;
                currentEnd = currentFarthest;
                if (currentFarthest >= A.length - 1) {
                    return jumps;
                }
            }
        }
        return currentFarthest >= A.length - 1 ? jumps : -1;
    }

//    public int jump(int[] A) {
//        int[] dp = new int[A.length];
//        Arrays.fill(dp, A.length);
//        dp[0] = 0;
//        for (int i = 1; i < A.length; i++) {
//            for (int j = 0; j < i; j++) {
//                if (A[j] + j >= i) {
//                    dp[i] = Math.min(dp[i], dp[j] + 1);
//                }
//            }
//        }
//        return dp[dp.length - 1];
//    }

    public static void main(String[] args) {
        int[] array = {2, 3, 1, 1, 4};
        JumpGameII instance = new JumpGameII();
        System.out.println(instance.jump(array));
    }
}
