package org.darion.leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class PascalsTriangle2 {
	public List<Integer> getRow(int rowIndex) {
		List<Integer> list = new LinkedList<Integer>();
		if (rowIndex < 0)
			return list;
		rowIndex -= 1;
		list.add(1);
		// System.out.println("Base : " + list.size());
		for (int i = 0; i <= rowIndex; i++) {
			for (int j = list.size() - 2; j >= 0; j--) {
				// System.out.println("index : " + j + " " + (j + 1));
				// System.out.println(list.get(j) + " + " + list.get(j + 1)
				// + " = " + (list.get(j) + list.get(j + 1)));
				list.set(j + 1, list.get(j) + list.get(j + 1));
			}
			list.add(1);
			// System.out.println(Arrays.toString(list.toArray()));
		}
		return list;
	}

	public static void main(String[] args) {
		PascalsTriangle2 pascalsTriangle2 = new PascalsTriangle2();
		List<Integer> list = pascalsTriangle2.getRow(5);
		System.out.println(Arrays.toString(list.toArray()));
	}
}
