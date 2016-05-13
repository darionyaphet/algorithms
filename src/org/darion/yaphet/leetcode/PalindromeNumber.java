package org.darion.yaphet.leetcode;

/**
 * https://leetcode.com/problems/palindrome-number/
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String string = x + "";
        int size = string.length() - 1;
        for (int index = 0; index < string.length() / 2; index++) {
            if (string.charAt(index) != string.charAt(size - index)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        PalindromeNumber instance = new PalindromeNumber();
        System.out.println("12321 : " + instance.isPalindrome(12321));
        System.out.println("12322 : " + instance.isPalindrome(12322));
        System.out.println("0     : " + instance.isPalindrome(0));
    }
}
