package org.darion.yaphet.lintcode;

/**
 * http://www.lintcode.com/zh-cn/problem/count-and-say/
 * 
 * @author darion.yaphet
 * 
 */
public class CountAndSay {
	/**
	 * @param n
	 *            the nth
	 * @return the nth sequence
	 */
	public String countAndSay(int n) {
		if (n <= 0) {
			return "";
		} else {
			String before = "1";
			for (int index = 2; index <= n; index++) {
				int count = 0;
				char current = before.charAt(0);
				StringBuilder builder = new StringBuilder();
				for (int i = 0; i < before.length(); i++) {
					if (current == before.charAt(i)) {
						count += 1;
					} else {
						builder = builder.append(count).append(current);
						current = before.charAt(i);
						count = 1;
					}
				}
				before = builder.append(count).append(current).toString();
			}
			return before;
		}
	}

	public static void main(String[] args) {
		CountAndSay instance = new CountAndSay();
		System.out.println(instance.countAndSay(5));
	}
}
