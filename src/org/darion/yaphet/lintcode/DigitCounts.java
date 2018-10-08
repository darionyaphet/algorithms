package org.darion.yaphet.lintcode;

public class DigitCounts {
    public static int digitCounts(int k, int n) {
        int counter = 0;
        for (int i = 0; i <= n; i++) {
            int p = i;
            do {
                int m = p % 10;
                if (m == k) {
                    counter += 1;
                }
                p /= 10;
            } while (p != 0);
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(digitCounts(1, 12));
    }
}
