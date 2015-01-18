package org.darion.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ValidParentheses {
	public boolean isValid(String s) {
		Map<Character, Character> map = new HashMap<Character, Character>();
		map.put('(', ')');
		map.put('{', '}');
		map.put('[', ']');

		Set<Character> ends = new HashSet<Character>();
		ends.add(']');
		ends.add(')');
		ends.add('}');

		char[] array = s.toCharArray();
		boolean in = false;
		for (int head = 0; head < array.length; head++) {
			if (in && ends.contains(array[head])) {
				return false;
			}

			if (map.keySet().contains(array[head])) {
				in = true;
				boolean flag = false;
				for (int tail = array.length - 1; tail > head; tail--) {
					if (array[tail] == map.get(array[head])) {
						flag = true;
						in = false;
						break;
					}
				}

				if (!flag) {
					return flag;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		ValidParentheses parentheses = new ValidParentheses();
		System.out.println(parentheses.isValid("()[]{}"));
		System.out.println(parentheses.isValid("([{}[]]){}"));
		System.out.println(parentheses.isValid("]"));
	}
}
