package org.darion.yaphet.lintcode;

import java.util.HashMap;
import java.util.Map;

/**
 * http://www.lintcode.com/zh-cn/problem/max-points-on-a-line/
 * 
 * @author darion.yaphet
 * 
 */
public class MaxPointsOnALine {
	/**
	 * @param points
	 *            an array of point
	 * @return an integer
	 */
	public int maxPoints(Point[] points) {

		if (points == null || points.length == 0) {
			return 0;
		}

		if (points.length == 1) {
			return 1;
		}

		Map<Double, Integer> map = new HashMap<Double, Integer>();
		for (int i = 0; i < points.length; i++) {
			for (int j = 0; j < points.length; j++) {
				if (i == j) {
					continue;
				}

				int val = 1;
				double slope = 0D;
				if (points[i] == null || points[j] == null) {
					continue;
				}

				if (points[i].x != points[j].x) {
					slope = Math.abs((points[j].y - points[i].y)
							/ (points[j].x - points[i].x));
					if (map.containsKey(slope)) {
						val += map.get(slope);
					}
				} else if (points[i].y == points[j].y) {
					if (map.containsKey(slope)) {
						val += map.get(slope);
					}
				} else {
				}

				map.put(slope, val);
			}

		}

		int max = 0;
		for (double key : map.keySet()) {
			if (map.get(key) > max) {
				max = map.get(key);
			}
		}
		return max / 2;
	}

	public static void main(String[] args) {
		MaxPointsOnALine instance = new MaxPointsOnALine();
		// Point[] points = { new Point(1, 2), new Point(3, 6), new Point(0, 0),
		// new Point(1, 3) };
		// Point[] points = { new Point(1, 2), new Point(3, 6), new Point(0, 0),
		// new Point(1, 3) };

		Point[] points = { new Point(0, 0), new Point(0, 0) };
		System.out.println(instance.maxPoints(points));
	}
}
