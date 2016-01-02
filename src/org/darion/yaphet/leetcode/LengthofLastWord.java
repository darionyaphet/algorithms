package org.darion.yaphet.leetcode;

import java.util.Arrays;

public class LengthofLastWord {
	public int lengthOfLastWord(String s) {
		if (s == null || s.trim().length() == 0) {
			return 0;
		}

		String[] array = s.trim().split(" ");
		return array[array.length - 1].length();
	}

	public static void main(String[] args) {
		LengthofLastWord word = new LengthofLastWord();
		System.out.println(word.lengthOfLastWord("Hello World"));
		System.out.println(word.lengthOfLastWord("Hello Worldtest"));
		System.out.println(word.lengthOfLastWord("Today is a nice day"));
		System.out.println(word.lengthOfLastWord(" "));
		System.out.println(word.lengthOfLastWord("     "));
		System.out.println(word.lengthOfLastWord(null));
	}
}
