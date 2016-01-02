package org.darion.yaphet.leetcode;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountandSay {

	public String countAndSay(int n) {
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();

		while (n != 0) {
			int key = n % 10;
			if (!map.containsKey(key)) {
				map.put(key, 1);
			} else {
				int val = map.get(key) + 1;
				map.put(key, val);
			}
			n /= 10;
		}

		StringBuilder builder = new StringBuilder();
		for (Integer integer : map.keySet()) {
			// System.out.println(map.get(integer) + "\t" + integer);
			builder.append(map.get(integer));
			builder.append(integer);
		}
		return builder.toString();
	}

	public static void main(String[] args) {
		CountandSay countandSay = new CountandSay();
		// String result = countandSay.countAndSay(1223334546);
		// String result = countandSay.countAndSay(1);
		String result = countandSay.countAndSay(21);
		System.out.println(result);
	}
}
