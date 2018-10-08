package org.darion.yaphet.lintcode;

/**
 * http://www.lintcode.com/zh-cn/problem/best-time-to-buy-and-sell-stock-ii/
 */
public class BestTimeToBuyAndSellStockII {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int max = 0;
        for (int index = 1; index < prices.length; index++) {
            if (prices[index] > prices[index - 1]) {
                max += (prices[index] - prices[index - 1]);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] array = {2, 1, 2, 0, 1};
        BestTimeToBuyAndSellStockII instance = new BestTimeToBuyAndSellStockII();
        System.out.println(instance.maxProfit(array));
    }
}
