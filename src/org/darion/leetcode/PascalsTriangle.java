package org.darion.leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class PascalsTriangle {

	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> list = new LinkedList<List<Integer>>();

		for (int index = 1; index <= numRows; index++) {
			// System.out.println("index : " + index);
			if (index == 1) {
				// System.out.println("one");
				List<Integer> one = new LinkedList<Integer>();
				one.add(1);
				list.add(one);
				continue;
			}
			// System.out.println(Arrays.toString(list.toArray()));
			// System.out.println(list.size());

			if (index == 2) {
				// System.out.println("two");
				List<Integer> two = new LinkedList<Integer>();
				two.add(1);
				two.add(1);
				// System.err.println("2:" + two.size());
				list.add(two);
				continue;
			}

			List<Integer> sub = new LinkedList<Integer>();
			for (int i = 1; i <= index; i++) {
				// System.out.println("\t" + i);
				if (i == 1 || i == (index)) {
					sub.add(1);
				} else {
					// System.out.println("index \t" + index + "\t" + i);
					// System.out.println("\t" + (index - 1) + "\t" + (i - 2));
					// System.out.println("\t" + (index - 1) + "\t" + (i - 1));

					sub.add(list.get(index - 2).get(i - 2)
							+ list.get(index - 2).get(i - 1));
				}
			}
			list.add(sub);
			// System.out.println(Arrays.toString(list.toArray()));
		}
		return list;
	}

	public static void main(String[] args) {
		PascalsTriangle pascalsTriangle = new PascalsTriangle();
		List<List<Integer>> list = pascalsTriangle.generate(5);

		for (List<Integer> sub : list) {
			System.out.println(Arrays.toString(sub.toArray()));
		}
	}
}
