package org.darion.yaphet.lintcode;

/**
 * http://www.lintcode.com/zh-cn/problem/reverse-words-in-a-string/
 */
public class ReverseWordsInAString {
    public static String reverseWords(String s) {
        String[] array = s.split(" ");
        StringBuffer buffer = new StringBuffer();
        for (int i = array.length - 1; i >= 0; i--) {
            if (!array[i].equals("")) {
                buffer.append(array[i]);
                buffer.append(" ");
            }
        }
        return buffer.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("hello world"));
        System.out.println(reverseWords(" hello world"));
        System.out.println(reverseWords("hello world "));
        System.out.println(reverseWords("  hello world"));
        System.out.println(reverseWords("hello   world"));
        System.out.println(reverseWords("hello world  "));
    }
}
