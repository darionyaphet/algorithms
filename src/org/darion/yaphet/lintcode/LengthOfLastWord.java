package org.darion.yaphet.lintcode;

/**
 * http://www.lintcode.com/zh-cn/problem/length-of-last-word/
 * 
 * @author darion.yaphet
 * 
 */
public class LengthOfLastWord {
	/**
	 * @param s
	 *            A string
	 * @return the length of last word
	 */
	public int lengthOfLastWord(String s) {
		if (s == null)
			return 0;
		
		String[] array = s.split(" ");
		for (int index = array.length - 1; index >= 0; index--) {
			if (!" ".equals(array[index])) {
				return array[index].length();
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		String s = "Hello World";
		s = "  an the  ";
		s = null;
		LengthOfLastWord instance = new LengthOfLastWord();
		System.out.println(instance.lengthOfLastWord(s));
	}
}
