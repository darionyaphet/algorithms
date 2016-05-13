package org.darion.yaphet.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/reverse-vowels-of-a-string/
 */
public class ReverseVowelsOfAString {
    public String reverseVowels(String s) {
        if (s == null) {
            return null;
        }

        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        int[] array = new int[s.length() - 1];
        for (int index = 0; index < s.length(); index++) {
            if (vowels.contains(s.charAt(index))) {
                array[index] = 1;
            }
        }

        int start = 0;
        int end = s.length() - 1;

        while (start < end) {

        }

        return "";
    }

    public static void main(String[] args) {
        ReverseVowelsOfAString instance = new ReverseVowelsOfAString();
        System.out.println(instance.reverseVowels("leetcode"));
        System.out.println(instance.reverseVowels(""));
        System.out.println(instance.reverseVowels(""));
        System.out.println(instance.reverseVowels(null));
    }
}
