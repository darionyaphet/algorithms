package org.darion.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomantoInteger {
	public int romanToInt(String s) {

		if (s == null || s.trim().length() == 0) {
			return 0;
		}

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);

		int result = 0;
		Character nextOne = null;
		// for (Character token : s.toCharArray()) {
		for (int index = s.length(); index >= 0; index--) {	
			char token = s.charAt(index);

			if (map.get(token) < map.get(token)) {
				if (map.containsKey(token)) {
					result = map.get(token) - map.get(nextOne);
				} else {
					// don't know how to process this one
				}
			} else {
				if (map.containsKey(token)) {
					result += map.get(token);
				} else {
					// don't know how to process this one
				}
			}
		}

		return result;
	}

	public static void main(String[] args) {
		RomantoInteger romantoInteger = new RomantoInteger();
		System.out.println(romantoInteger.romanToInt("MCMXCVI"));
	}
}
