package org.darion.yaphet.lintcode;

/**
 * http://www.lintcode.com/zh-cn/problem/best-time-to-buy-and-sell-stock/
 */
public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int max = 0;
        int current = prices[0];
        for (int index = 1; index < prices.length; index++) {
            if (prices[index] < current) {
                current = prices[index];
            } else {
                int diff = prices[index] - current;
                if (diff > max) {
                    max = diff;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] array = {3, 2, 3, 1, 2};
        BestTimeToBuyAndSellStock instance = new BestTimeToBuyAndSellStock();
        System.out.println(instance.maxProfit(array));
    }
}
