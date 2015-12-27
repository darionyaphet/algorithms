package org.darion.yaphet.lintcode;

/**
 * http://www.lintcode.com/zh-cn/problem/strstr/
 * 
 * @author darion.yaphet
 *
 */
public class Strstr {

	public int strStr(String source, String target) {
		return -1;
	}

	public static void main(String[] args) {
		Strstr instance = new Strstr();
		System.out.println(instance.strStr("source", "target"));// -1
		System.out.println(instance.strStr("abcdabcdefg", "bcd")); // 1
	}
}
