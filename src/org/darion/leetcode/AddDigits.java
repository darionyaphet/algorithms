package org.darion.leetcode;

/**
 * https://leetcode.com/problems/add-digits/
 * 
 * @author darion.yaphet
 *
 */
public class AddDigits {

	public int addDigits(int num) {
		int result = 0;
		while (num != 0) {
			result += num % 10;
		}
		return result;
	}

	public static void main(String[] args) {
		AddDigits instance = new AddDigits();

	}

}
