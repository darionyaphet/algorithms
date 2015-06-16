package org.darion.leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MergeIntervals {
	public MergeIntervals() {

	}

	public List<Interval> merge(List<Interval> intervals) {
		List<Interval> result = new LinkedList<Interval>();
		TreeMap<Integer, Integer> ranges = new TreeMap<Integer, Integer>();

		for (Interval interval : intervals) {
			System.out.println("Try : " + interval.start + " " + interval.end);
			Integer start = ranges.floorKey(interval.start);
			System.out.println("Get Start : " + start);
			if (start != null) {
				Integer end = ranges.get(start);
				if (interval.start <= end) {
					if (end < interval.end) {
						System.out.println("Put : " + start + " "
								+ interval.end);
						ranges.put(start, interval.end);
					}
				} else {
					System.out.println("Put : " + interval.start + " "
							+ interval.end);
					ranges.put(interval.start, interval.end);
				}
			} else {
				System.out.println("Put : " + interval.start + " "
						+ interval.end);
				ranges.put(interval.start, interval.end);
			}
		}

		for (Map.Entry<Integer, Integer> entry : ranges.entrySet()) {
			System.out.println("Result : " + entry.getKey() + " "
					+ entry.getValue());
			result.add(new Interval(entry.getKey(), entry.getValue()));
		}
		return result;
	}

	public static void main(String[] args) {
		List<Interval> list = new LinkedList<Interval>();
		// list.add(new Interval(1, 3));
		// list.add(new Interval(2, 6));
		// list.add(new Interval(8, 10));
		// list.add(new Interval(15, 18));

		// list.add(new Interval(1, 4));
		// list.add(new Interval(4, 5));

		list.add(new Interval(0, 4));
		list.add(new Interval(1, 4));

		MergeIntervals intervals = new MergeIntervals();
		List<Interval> result = intervals.merge(list);

		for (Interval interval : result) {
			System.out.println(interval.start + " : " + interval.end);
		}
	}

}
