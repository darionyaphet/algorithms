package org.darion.yaphet.lintcode;

import java.util.HashSet;
import java.util.Set;

/**
 * http://www.lintcode.com/zh-cn/problem/unique-characters/
 * 
 * @author darion.yaphet
 * 
 */
public class UniqueCharacters {
	public UniqueCharacters() {

	}

	/**
	 * @param str
	 *            : a string
	 * @return: a boolean
	 */
	public boolean isUnique(String str) {
		if (str == null || str.length() == 0) {
			return true;
		}

		Set<Character> set = new HashSet<Character>();
		for (Character element : str.toCharArray()) {
			if (!set.contains(element)) {
				set.add(element);
			} else {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String str = "abcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+";
		UniqueCharacters instance = new UniqueCharacters();
		System.out.println(instance.isUnique(str));
	}
}
