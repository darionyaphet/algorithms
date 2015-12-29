package org.darion.yaphet.lintcode;

import java.util.Arrays;

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

		if (string == null) {
			return 0;
		}

		int spaceNumber = 0;
		for (char element : string) {
			if (element == ' ') {
				spaceNumber += 1;
			}
		}

		char[] array = new char[string.length + 2 * spaceNumber];
		System.arraycopy(string, 0, array, 0, length);
		// System.out.println(Arrays.toString(array));
		// System.out.println(array.length);

		int index = array.length - 1;
		for (int i = string.length - 1; i >= 0; i--) {
			if (string[i] == ' ') {
				array[index--] = '0';
				array[index--] = '2';
				array[index--] = '%';
			} else {
				array[index--] = string[i];
			}
		}
		return array.length;
	}

	public static void main(String[] args) {
		SpaceReplacement instance = new SpaceReplacement();
		// String input = "Mr John Smith";
		char[] input = "hello world".toCharArray();
		int size = instance.replaceBlank(input, input.length);
		System.out.println(Arrays.toString(input));
		System.out.println(size);
	}
}
