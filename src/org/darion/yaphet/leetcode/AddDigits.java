package org.darion.yaphet.leetcode;

/**
 * https://leetcode.com/problems/add-digits/
 * 
 * @author darion.yaphet
 *
 */
public class AddDigits {

	public int addDigits(int num) {
		int result = 0;
		do {
			while (num > 0) {
				result += num % 10;
				num = num / 10;
				System.out.println(num + " " + result);
			}
		} while (num > 10);

		return result;
	}

	public static void main(String[] args) {
		AddDigits instance = new AddDigits();
		System.out.println(instance.addDigits(38));
	}

}
