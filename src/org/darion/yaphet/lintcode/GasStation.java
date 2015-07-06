package org.darion.yaphet.lintcode;

/**
 * http://www.lintcode.com/zh-cn/problem/gas-station/
 * 
 * @author darion.yaphet
 * 
 */
public class GasStation {
	public GasStation() {

	}

	/**
	 * @param gas
	 *            : an array of integers
	 * @param cost
	 *            : an array of integers
	 * @return: an integer
	 */
	public int canCompleteCircuit(int[] gas, int[] cost) {
		int result = -1;

		for (int p = 0; p < gas.length; p++) {
			int i;
			int rest = 0;

			for (i = p; i < gas.length; i++) {
				// System.out.print(i + " ");
				if (gas[i] >= cost[i]) {
					rest += (gas[i] - cost[i]);
				} else {
					rest -= (cost[i] - gas[i]);
				}

				if (rest < 0)
					break;
			}

			for (int j = 0; j < p; j++) {
				if (rest < 0)
					break;
				// System.out.print(j + " ");
				if (gas[j] >= cost[j]) {
					rest += (gas[j] - cost[j]);
				} else {
					rest -= (cost[j] - gas[j]);
				}

				if (rest < 0)
					break;
			}

			// System.out.println("\nP " + p + " --> " + rest);
			if (rest >= 0) {
				result = p;
				break;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		GasStation instance = new GasStation();
		int[] gas = { 1, 1, 3, 1 };
		int[] cost = { 2, 2, 1, 1 };
		System.out.println(instance.canCompleteCircuit(gas, cost));
	}
}
