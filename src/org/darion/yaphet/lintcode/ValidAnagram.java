package org.darion.yaphet.lintcode;


import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public boolean anagram(String s, String t) {
        if (s == null && t == null) {
            return true;
        }

        if (s == null || t == null) {
            return false;
        }

        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> aMap = new HashMap<>();
        Map<Character, Integer> bMap = new HashMap<>();

        for (int index = 0; index < s.length(); index++) {
            char key = s.charAt(index);
            if (aMap.containsKey(key)) {
                int val = aMap.get(key) + 1;
                aMap.put(key, val);
            } else {
                aMap.put(key, 1);
            }
        }

        for (int index = 0; index < t.length(); index++) {
            char key = t.charAt(index);
            if (bMap.containsKey(key)) {
                int val = bMap.get(key) + 1;
                bMap.put(key, val);
            } else {
                bMap.put(key, 1);
            }
        }

        if (aMap.size() != bMap.size()) {
            return false;
        }

        for (Map.Entry<Character, Integer> entry : aMap.entrySet()) {
            if (bMap.containsKey(entry.getKey()) && bMap.get(entry.getKey()) == entry.getValue()) {
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        ValidAnagram instance = new ValidAnagram();
        System.out.println(instance.anagram("abcd", "dcab"));
        System.out.println(instance.anagram("ab", "ab"));
        System.out.println(instance.anagram("ab", "ac"));
        System.out.println(instance.anagram("", ""));

        System.out.println(instance.anagram("happy new year", "n ahwryeypp ea"));

    }
}
