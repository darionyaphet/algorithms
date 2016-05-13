package org.darion.yaphet.leetcode;

/**
 * https://leetcode.com/problems/reverse-string/
 */
public class ReverseString {

    public String reverseString(String s) {
        if (s == null) {
            return null;
        }

        char[] array = new char[s.length()];
        for (int index = 0; index < s.length(); index++) {
            array[index] = s.charAt(index);
        }

        StringBuilder builder = new StringBuilder();
        for (int index = s.length() - 1; index >= 0; index--) {
            builder.append(array[index]);
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        ReverseString instance = new ReverseString();
        System.out.println(instance.reverseString("hello"));
        System.out.println(instance.reverseString("hello world !"));
        System.out.println(instance.reverseString(""));
        System.out.println(instance.reverseString(null));
    }
}
