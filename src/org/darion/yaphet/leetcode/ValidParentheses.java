package org.darion.yaphet.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class ValidParentheses {
	public boolean isValid(String s) {
		Map<Character, Character> map = new HashMap<Character, Character>();
		map.put('(', ')');
		map.put('{', '}');
		map.put('[', ']');

		Deque<Character> stack = new ArrayDeque<Character>();
		for (Character character : s.toCharArray()) {
			if (map.keySet().contains(character)) {
				stack.push(character);
			} else {
				if (stack.isEmpty()) {
					return false;
				}

				Character top = stack.pop();
				// System.out.println("top : "+top);
				if (!map.get(top).equals(character)) {
					return false;
				}
			}
		}

		// System.out.println(stack.size());
		if (stack.size() == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		ValidParentheses parentheses = new ValidParentheses();
		System.out.println(parentheses.isValid("()[]{}"));
		System.out.println(parentheses.isValid("([{}[]]){}"));
		System.out.println(parentheses.isValid("]"));
		System.out.println(parentheses.isValid("([)]"));
		System.out.println(parentheses.isValid("({}[)]"));

		System.out.println(parentheses.isValid("(]"));
		System.out.println(parentheses.isValid("([)]"));
	}
}
