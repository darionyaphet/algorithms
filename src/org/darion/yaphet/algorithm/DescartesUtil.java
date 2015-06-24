package org.darion.yaphet.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DescartesUtil {
	public static void main(String[] args) {

		List<String> list0 = Arrays.asList("0");
		List<String> list1 = Arrays.asList("1", "11");
		List<String> list2 = Arrays.asList("2", "22", "222");
		List<String> list3 = Arrays.asList("3", "33", "333", "3333");
		List<List<String>> list = Arrays.asList(list0, list1, list2, list3);
		List<List<String>> result = new ArrayList<List<String>>();
		DescartesUtil.descartes(list, result, 0, new ArrayList<String>());
		System.out.println(result);
	}

	private static void descartes(List<List<String>> dimvalue,
			List<List<String>> result, int layer, List<String> curList) {
		if (layer < dimvalue.size() - 1) {
			if (dimvalue.get(layer).size() == 0) {
				DescartesUtil.descartes(dimvalue, result, layer + 1, curList);
			} else {
				for (int i = 0; i < dimvalue.get(layer).size(); i++) {
					List<String> list = new ArrayList<String>(curList);
					list.add(dimvalue.get(layer).get(i));
					DescartesUtil.descartes(dimvalue, result, layer + 1, list);
				}
			}
		} else if (layer == dimvalue.size() - 1) {
			if (dimvalue.get(layer).size() == 0) {
				result.add(curList);
			} else {
				for (int i = 0; i < dimvalue.get(layer).size(); i++) {
					List<String> list = new ArrayList<String>(curList);
					list.add(dimvalue.get(layer).get(i));
					result.add(list);
				}
			}
		}
	}
}