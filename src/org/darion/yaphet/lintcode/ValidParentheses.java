package org.darion.yaphet.lintcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

/**
 * http://www.lintcode.com/zh-cn/problem/valid-parentheses/
 * 
 * @author darion.yaphet
 * 
 */
public class ValidParentheses {
	/**
	 * @param s
	 *            A string
	 * @return whether the string is a valid parentheses
	 */
	public boolean isValidParentheses(String s) {
		if (s == null || s.length() == 0) {
			return false;
		}

		if (s.length() % 2 != 0) {
			return false;
		}

		Set<Character> set = new HashSet<Character>();
		set.add('[');
		set.add('(');
		set.add('{');

		Map<Character, Character> map = new HashMap<Character, Character>();
		map.put(')', '(');
		map.put(']', '[');
		map.put('}', '{');

		Stack<Character> stack = new Stack<Character>();
		for (char element : s.toCharArray()) {
			if (!map.keySet().contains(element)) {
				stack.add(element);
			} else {
				Character topElement = stack.pop();
				if (!map.get(element).equals(topElement)) {
					return false;
				}
			}
		}
		if (stack.size() == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		ValidParentheses instance = new ValidParentheses();
		String s = "()[]{}";
		s = "([)]";
		s = "(";
		s = null;
		s = "({[()]})";
		s = "([)";
		s = "[({(())}[()])]";
		s = "((";
		System.out.println(instance.isValidParentheses(s));
	}
}
