package org.darion.yaphet.leetcode;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
	public int majorityElement(int[] num) {
		if (num.length == 1) {
			return num[0];
		}

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int number = (num.length / 2) + 1;
		for (int element : num) {
			if (map.keySet().contains(element)) {
				int val = map.get(element) + 1;
				map.put(element, val);
			} else {
				map.put(element, 1);
			}

			if (map.get(element) >= number) {
				return element;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7 };
		MajorityElement element = new MajorityElement();
		System.out.println(element.majorityElement(array));
	}
}
