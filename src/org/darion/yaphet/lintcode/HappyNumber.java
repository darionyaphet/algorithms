package org.darion.yaphet.lintcode;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public boolean isHappy(int n) throws InterruptedException {

        Set<Integer> set = new HashSet<>();
        int sum = 0;

        do {
            sum = 0;
            while (n != 0) {
                sum += Math.pow(n % 10, 2);
                n /= 10;
            }

            n = sum;
            if (set.contains(sum)) {
                return false;
            } else {
                set.add(sum);
            }
        } while (sum != 1);

        return true;
    }

    public static void main(String[] args) throws InterruptedException {
        HappyNumber instance = new HappyNumber();
        System.out.println(instance.isHappy(1));
    }
}
