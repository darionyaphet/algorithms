package org.darion.algorithms.string;

public class PalindromeString {
	private static final char[] INPUT = "abcdba".toCharArray();
	private static final int SIZE = INPUT.length;

	public static void simple() {
		boolean check = true;
		for (int index = 0; index <= INPUT.length / 2; index++) {
			if (INPUT[index] != INPUT[SIZE - index - 1]) {
				check = false;
			}
		}
		System.out.println(check);
	}

	public static void main(String[] args) {
		simple();
	}
}
