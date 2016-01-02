package org.darion.yaphet.leetcode;

/**
 * https://leetcode.com/problems/nim-game/
 * 
 * @author Darion.Yaphet
 *
 */
public class NimGame {

	public NimGame() {

	}

	public boolean canWinNim(int n) {
		return n % 4 != 0;
	}

	public static void main(String[] args) {
		NimGame instance = new NimGame();
		System.out.println("4 : " + instance.canWinNim(4));
		System.out.println("5 : " + instance.canWinNim(5));
		System.out.println("6 : " + instance.canWinNim(6));
		System.out.println("7 : " + instance.canWinNim(7));
		System.out.println("8 : " + instance.canWinNim(8));
	}

}
