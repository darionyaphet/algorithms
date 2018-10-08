package org.darion.yaphet.lintcode;

import java.util.Arrays;

public class PerfectSquares {
    public int numSquares(int n) {
        int size = (int) Math.sqrt(n);

        int[] tmp = new int[size + 1];
        int[] counters = new int[size + 1];
        for (int i = 0; i <= size; i++) {
            tmp[i] = i * i;
        }
        System.out.println(Arrays.toString(tmp));

        for (int i = 1; i <= size; i++) {
            int total = 0;
            int val = n;
            for (int j = i; j >= 1; j--) {
                int count = val / tmp[j];
                total += count;
                val %= tmp[j];
                if (val == 0) {
                    break;
                }
            }
            counters[i] = total;
            System.out.println(i + "  " + Arrays.toString(counters));
        }

        int min = Integer.MAX_VALUE;
        for (int i = 1; i < counters.length; i++) {
            if (min > counters[i]) {
                min = counters[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        PerfectSquares instance = new PerfectSquares();
        System.out.println(instance.numSquares(12));
    }
}
