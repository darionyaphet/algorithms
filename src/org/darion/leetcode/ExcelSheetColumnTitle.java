package org.darion.leetcode;

public class ExcelSheetColumnTitle {

	public String convertToTitle(int n) {
		StringBuilder builder = new StringBuilder();
		while (n > 0) {
			n--;
			builder.append((char) ('A' + (n % 26)));
			n /= 26;
		}
		return builder.reverse().toString();
	}

	public static void main(String[] args) {
		ExcelSheetColumnTitle title = new ExcelSheetColumnTitle();
		System.out.println(title.convertToTitle(26));
	}
}
