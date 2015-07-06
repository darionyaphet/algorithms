package org.darion.yaphet.lintcode;

/**
 * http://www.lintcode.com/zh-cn/problem/coins-in-a-line/
 * 
 * @author darion.yaphet
 * 
 */
public class CoinsInALine {
	public CoinsInALine() {

	}

	/**
	 * @param n
	 *            : an integer
	 * @return: a boolean which equals to true if the first player will win
	 */
	public boolean firstWillWin(int n) {
		return n % 3 != 0;
	}

	public static void main(String[] args) {
		CoinsInALine instance = new CoinsInALine();
		System.out.println(instance.firstWillWin(1));
		System.out.println(instance.firstWillWin(2));
		System.out.println(instance.firstWillWin(3));
		System.out.println(instance.firstWillWin(4));
		System.out.println(instance.firstWillWin(5));
	}
}
