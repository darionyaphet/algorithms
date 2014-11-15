package org.darion.leetcode;

import java.util.LinkedList;
import java.util.List;

public class StringtoInteger {

	public int atoi(String str) {
		// remove whitespace
		str = str.trim();
		// System.out.println("remove whitespace : " + str);

		if (str.length() == 0 || str == null || str.contains(".")) {
			return 0;
		}

		// negative
		boolean flag = false;
		int count = 0;
		char[] tokens;
		while (true) {
			if (str.startsWith("-")) {
				flag = true;
				str = str.substring(1);
				if (count == 0) {
					count++;
				} else {
					return 0;
				}
			} else if (str.contains("+")) {
				str = str.substring(1);
				if (count == 0) {
					count++;
				} else {
					return 0;
				}
			} else {
				// tokens = str.toCharArray();
				List<Character> chars = new LinkedList<Character>();
				for (char c : str.toCharArray()) {
					// System.out.println(c);
					if (chars.size() == 0 && c == '0') {
						continue;
					} else {
						if (Character.isDigit(c)) {
							chars.add(c);
						} else {
							break;
						}
					}
				}
				tokens = new char[chars.size()];
				for (int index = 0; index < chars.size(); index++) {
					tokens[index] = chars.get(index);
				}
				break;
			}
		}
		if (flag && tokens.length > 11) {
			return Integer.MIN_VALUE;
		} else if (!flag && tokens.length > 10) {
			return Integer.MAX_VALUE;
		} else {
		}
		// System.out.println(Arrays.toString(tokens));

		// is vaild string cover to integer?
		int result = 0;
		int size = tokens.length;
		for (int index = tokens.length - 1; index >= 0; index--) {
			// for (int index = 0; index < size; index++) {
			int i = (int) Math.pow(10, index);
			char c = tokens[size - 1 - index];
			if (Character.isDigit(c)) {
				result += i * (tokens[size - 1 - index] - 48);
			} else {
				return result;
			}
			// System.out.println(c + "\t" + i + " = " + i * (c - 48));
			// System.out.println(tokens[size - 1 - index] + "\t"
			// + Math.pow(10, index) + "\t" + tokens[size - 1 - index]
			// * (int) Math.pow(10, index));
		}

		if (flag) {
			result *= -1;
		}

		if (result > 0 && flag)
			return Integer.MIN_VALUE;

		if (result < 0 && !flag)
			return Integer.MAX_VALUE;

		return result;
	}

	public static void main(String[] args) {
		// System.out.println(Integer.MAX_VALUE);
		// System.out.println(Integer.MIN_VALUE);

		String max = "2147483648";
		String min = "-2147483647";
		System.out.println(max.length());
		System.out.println(min.length());
		StringtoInteger atoi = new StringtoInteger();
		// String line = "12345";
		// String line = "  -1234.5a4 ";
		String line = "2147483648";
		// String line = "-2147483648";
		int result = atoi.atoi(min);
		System.out.println(result);
	}
}
