package org.darion.yaphet.lintcode;

import java.util.Arrays;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int count = 0;
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == 9) {
                count += 1;
            }
        }
        int[] array;
        if (count == digits.length) {
            System.out.println("9");
            array = new int[digits.length + 1];
            array[0] = 1;
            return array;
        } else {
            boolean up = false;
            for (int i = digits.length - 1; i >= 0; i--) {
                if (digits[i] == 9) {
                    up = true;
                    digits[i] = 0;
                } else {
                    if (up) {//&& digits[i] != 9) {
                        digits[i] += 1;
                        return digits;
                    } else {
                        digits[i] += 1;
                        return digits;
                    }
                }
            }
            return digits;
        }
    }

    public static void main(String[] args) {
        int[] array = {2, 4, 9, 3, 9};
        PlusOne instance = new PlusOne();
        System.out.println(Arrays.toString(instance.plusOne(array)));
    }
}
