package org.darion.yaphet.lintcode;

import java.util.HashMap;
import java.util.Map;

/**
 * http://www.lintcode.com/zh-cn/problem/two-strings-are-anagrams/#
 * 
 * @author darion.yaphet
 *
 */
public class TwoStringsAreAnagrams {

	public boolean anagram(String s, String t) {

		if (s == null && t == null) {
			return true;
		}

		if (s == null || t == null) {
			return false;
		}

		// final int SIZE = 26;
		// int[] sCount = new int[SIZE];
		// int[] tCount = new int[SIZE];
		//
		// for (Character element : s.toCharArray()) {
		// sCount[element - 97] += 1;
		// }
		//
		// for (Character element : t.toCharArray()) {
		// tCount[element - 97] += 1;
		// }
		//
		// for (int index = 0; index < SIZE; index++) {
		// if (sCount[index] != tCount[index]) {
		// return false;
		// }
		// }

		Map<Character, Integer> sCount = new HashMap<>();
		Map<Character, Integer> tCount = new HashMap<>();

		for (Character element : s.toCharArray()) {
			int value = 1;
			if (sCount.containsKey(element)) {
				value += sCount.get(element);
			}
			sCount.put(element, value);
		}

		for (Character element : t.toCharArray()) {
			int value = 1;
			if (tCount.containsKey(element)) {
				value += tCount.get(element);
			}
			tCount.put(element, value);
		}

		for (Character key : sCount.keySet()) {
			if (!tCount.containsKey(key)) {
				return false;
			}

			if (tCount.get(key) != sCount.get(key)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		TwoStringsAreAnagrams instance = new TwoStringsAreAnagrams();
		System.out.println(instance.anagram(null, null));
		System.out.println(instance.anagram("a", null));
		System.out.println(instance.anagram(null, "a"));

		System.out.println(instance.anagram("abcd", "dcab"));
		System.out.println(instance.anagram("abcd", "adcab"));

		System.out.println(instance.anagram("happy new year", "n ahwryeypp ea"));
	}
}
