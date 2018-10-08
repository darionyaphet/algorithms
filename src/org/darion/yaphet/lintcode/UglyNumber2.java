package org.darion.yaphet.lintcode;

public class UglyNumber2 {
    public static int nthUglyNumber(int n) {
        if (n == 1) {
            return 1;
        }

        int counter = n - 1;

        for (int i = 2; ; i++) {
            int num = i;
            do {
                if (num % 2 == 0) {
                    num /= 2;
                }
                if (num % 3 == 0) {
                    num /= 3;
                }
                if (num % 5 == 0) {
                    num /= 5;
                }
            } while (num != 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(nthUglyNumber(9));
    }
}
