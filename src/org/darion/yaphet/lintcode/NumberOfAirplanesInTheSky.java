package org.darion.yaphet.lintcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class NumberOfAirplanesInTheSky {
	/**
	 * @param intervals:
	 *            An interval array
	 * @return: Count of airplanes are in the sky.
	 */
	public int countOfAirplanes(List<Interval> airplanes) {
		int max = 0;
		for (Interval interval : airplanes) {
			if (max < interval.end) {
				max = interval.end;
			}
		}
		max += 1;
		int[] count = new int[max];
		for (Interval interval : airplanes) {
			int start = interval.start;
			int end = interval.end;

			if (interval.start < interval.end) {
				for (int index = start; index < end; index++) {
					count[index] += 1;
				}
			} else {
				for (int index = start; index <= 23; index++) {
					count[index] += 1;
				}

				for (int index = 0; index < end; index++) {
					count[index] += 1;
				}
			}

		}

		int result = count[0];
		for (int index = 1; index < max; index++) {
			if (result < count[index]) {
				result = count[index];
			}
		}
		return result;
	}

	public static void main(String[] args) {
		List<Interval> airplanes = new LinkedList<>();
		airplanes.add(new Interval(1, 10));
		airplanes.add(new Interval(2, 3));
		airplanes.add(new Interval(5, 8));
		airplanes.add(new Interval(4, 7));

		// airplanes.add(new Interval(1, 10));
		// airplanes.add(new Interval(10, 20));
		// airplanes.add(new Interval(20, 30));
		// airplanes.add(new Interval(30, 40));

		NumberOfAirplanesInTheSky instance = new NumberOfAirplanesInTheSky();
		System.out.println(instance.countOfAirplanes(airplanes));
	}
}
