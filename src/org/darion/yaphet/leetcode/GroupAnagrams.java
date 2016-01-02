package org.darion.yaphet.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class GroupAnagrams {
	public GroupAnagrams() {
	}

	public List<List<String>> groupAnagrams(String[] strs) {
		if (strs == null || strs.length == 0) {
			return null;
		}

		Map<String, List<String>> map = new TreeMap<String, List<String>>();
		for (String element : strs) {
			char[] source = element.toCharArray();
			Arrays.sort(source);
			String sourceString = new String(source);

			if (!map.containsKey(sourceString)) {
				List<String> value = new LinkedList<String>();
				value.add(element);
				map.put(sourceString, value);
			} else {
				map.get(sourceString).add(element);
			}
		}

		List<List<String>> result = new LinkedList<List<String>>();
		for (Map.Entry<String, List<String>> entry : map.entrySet()) {
			List<String> inners = entry.getValue();
			String[] innerArray = new String[inners.size()];
			for (int index = 0; index < inners.size(); index++) {
				innerArray[index] = inners.get(index);
			}
			
			Arrays.sort(innerArray);
			result.add(Arrays.asList(innerArray));
		}
		return result;
	}

	public static void main(String[] args) {
		// String[] array = { "eat", "tea", "tan", "ate", "nat", "bat" };
		String[] array = { "tea", "and", "ate", "eat", "den" };
		GroupAnagrams instance = new GroupAnagrams();
		System.out.println(instance.groupAnagrams(array));
	}
}
