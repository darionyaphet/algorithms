package org.darion.leetcode;

public class ExcelSheetColumnNumber {
	public int titleToNumber(String s) {
		int result = 0;
		int size = s.length();
		for (int index = 0; index < s.length(); index++) {
			result += (s.charAt(index) - 64) * Math.pow(26, size - index - 1);
		}
		return result;
	}

	public static void main(String[] args) {
		String input = "AB";
		ExcelSheetColumnNumber number = new ExcelSheetColumnNumber();
		System.out.println(number.titleToNumber(input));
	}
}
