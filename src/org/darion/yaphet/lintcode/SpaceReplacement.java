package org.darion.yaphet.lintcode;

/**
 * http://www.lintcode.com/zh-cn/problem/space-replacement/
 * 
 * @author darion.yaphet
 * 
 */
public class SpaceReplacement {
	/**
	 * @param string
	 *            : An array of Char
	 * @param length
	 *            : The true length of the string
	 * @return: The true length of new string
	 */
	public int replaceBlank(char[] string, int length) {

		return length;
	}

	public static void main(String[] args) {
		SpaceReplacement instance = new SpaceReplacement();
		String input = "Mr John Smith";
		int size = instance.replaceBlank(input.toCharArray(), input.length());
		System.out.println(size);
	}
}
