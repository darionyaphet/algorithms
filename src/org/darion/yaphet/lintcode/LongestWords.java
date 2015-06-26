package org.darion.yaphet.lintcode;

import java.util.ArrayList;

/**
 * http://www.lintcode.com/zh-cn/problem/longest-words/
 * 
 * @author darion.yaphet
 * 
 */
public class LongestWords {
	/**
	 * @param dictionary
	 *            : an array of strings
	 * @return: an arraylist of strings
	 */
	ArrayList<String> longestWords(String[] dictionary) {

		int maxSize = 0;
		ArrayList<String> list = new ArrayList<String>();
		if (dictionary == null) {
			return list;
		}

		for (String element : dictionary) {
			if (element == null) {
				continue;
			}
			
			if (element.length() > maxSize) {
				list.clear();
				maxSize = element.length();
				list.add(element);
			} else if (element.length() == maxSize) {
				list.add(element);
			} else {

			}
		}
		return list;
	}

	public static void main(String[] args) {
		// final String[] dictionary = { "dog", "google", "facebook",
		// "internationalization", "blabla" };
		// final String[] dictionary = { "like", "love", "hate", "yes" };
		// final String[] dictionary = null;
		// final String[] dictionary = {};
		final String[] dictionary = { "like", "love", null, "yes" };

		LongestWords instance = new LongestWords();
		ArrayList<String> list = instance.longestWords(dictionary);
		System.out.println(list);
	}
}
