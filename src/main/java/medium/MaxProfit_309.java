package medium;

/**
 *
 * 309. 最佳买卖股票时机含冷冻期
 *
 * 给定一个整数数组，其中第 i 个元素代表了第 i 天的股票价格 。​
 *
 * 设计一个算法计算出最大利润。在满足以下约束条件下，你可以尽可能地完成更多的交易（多次买卖一支股票）:
 *
 * 你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 * 卖出股票后，你无法在第二天买入股票 (即冷冻期为 1 天)。
 *
 * @author mascot
 * @date 2019/8/9 19:25
 */
public class MaxProfit_309 {
    public int maxProfit2(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }

        int[] cost = new int[prices.length];
        int[] profit = new int[prices.length];
        cost[0] = -prices[0];
        cost[1] = Math.max(cost[0], -prices[1]);
        profit[1] = Math.max(profit[0], cost[0] + prices[1]);
        for (int i = 2; i < prices.length; i++) {
            cost[i] = Math.max(cost[i - 1], profit[i - 2] - prices[i]);
            profit[i] = Math.max(profit[i - 1], cost[i - 1] + prices[i]);
        }

        return profit[prices.length - 1];
    }

    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }

        int cost = -prices[0], profit = 0, prePorfit = 0;
        for (int i = 1; i < prices.length; i++) {
            int temp = profit;
            profit = Math.max(profit, cost + prices[i]);
            cost = Math.max(cost, prePorfit - prices[i]);
            prePorfit = temp;
        }

        return profit;
    }
}
