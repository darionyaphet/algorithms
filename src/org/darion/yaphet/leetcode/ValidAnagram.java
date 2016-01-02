package org.darion.yaphet.leetcode;

import java.util.Arrays;

public class ValidAnagram {

	public ValidAnagram() {

	}

	public boolean isAnagram(String s, String t) {
		char[] source = s.toCharArray();
		char[] target = t.toCharArray();
		Arrays.sort(source);
		Arrays.sort(target);
		String sourceString = new String(source);
		String targetString = new String(target);
		if (sourceString.equals(targetString)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		ValidAnagram instance = new ValidAnagram();
		System.out.println(instance.isAnagram("anagram", "nagaram"));
		System.out.println(instance.isAnagram("rat", "cat"));
	}

}
