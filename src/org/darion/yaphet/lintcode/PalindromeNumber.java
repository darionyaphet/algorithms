package org.darion.yaphet.lintcode;

import java.util.LinkedList;
import java.util.List;

public class PalindromeNumber {
    public boolean isPalindrome(int num) {
        List<Integer> list = new LinkedList<>();
        while (num != 0) {
            list.add(num % 10);
            num /= 10;
        }
        System.out.println(list);

        int low = 0, hight = list.size() - 1;
        while (low < hight) {
            if (list.get(low) != list.get(hight)) {
                return false;
            } else {
                low += 1;
                hight -= 1;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        PalindromeNumber instance = new PalindromeNumber();
        System.out.println(instance.isPalindrome(1232));
    }
}
