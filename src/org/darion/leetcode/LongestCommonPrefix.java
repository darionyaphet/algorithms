package org.darion.leetcode;

public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {

		if (strs == null || strs.length == 0) {
			return "";
		}

		if (strs.length == 1) {
			return strs[0];
		}

		StringBuilder builder = new StringBuilder();
		boolean flag = true;

		for (int i = 0; i < strs[0].length(); i++) {
			System.out.println(strs[0].charAt(i));

			for (int j = 1; j < strs.length; j++) {
				if (i < strs[j].length()) {
					if (strs[0].charAt(i) != strs[j].charAt(i)) {
						flag = false;
					}
				} else {
					flag = false;
				}
			}

			if (flag) {
				builder.append(strs[0].charAt(i));
			}
		}
		return builder.toString();
	}

	public static void main(String[] args) {
		// String[] strs = { "a", "aa" };
		String[] strs = { "aa", "a" };
		LongestCommonPrefix prefix = new LongestCommonPrefix();
		System.out.println(prefix.longestCommonPrefix(strs));

	}
}
