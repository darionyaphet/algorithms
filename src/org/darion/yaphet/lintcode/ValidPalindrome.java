package org.darion.yaphet.lintcode;

import java.util.HashMap;
import java.util.Map;

public class ValidPalindrome {

	public boolean isPalindrome(String s) {

		if (s == null) {
			return false;
		}

		if (s.length() <= 1) {
			return true;
		}
		
		Map<Character, Integer> counter = new HashMap<>();
		for (Character element : s.toCharArray()) {

			if (!element.isAlphabetic(element) || !element.isDigit(element)) {
				return false;
			}

			int value = 1;
			if (counter.containsKey(element)) {
				value += counter.get(element);
			}
			counter.put(element, value);
		}

		int oddNumber = 0;
		for (Map.Entry<Character, Integer> entry : counter.entrySet()) {
			if (entry.getValue() % 2 == 1) {
				oddNumber += 1;
			}
		}
		if (oddNumber <= 1) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		ValidPalindrome instance = new ValidPalindrome();
		System.out.println(" : " + instance.isPalindrome(" "));
		System.out.println("race a car : " + instance.isPalindrome("race a car"));
		System.out.println("a. : " + instance.isPalindrome("a."));
	}

}
