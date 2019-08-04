package medium;

import java.util.Arrays;

/**
 * 322. 零钱兑换
 *
 * 给定不同面额的硬币 coins 和一个总金额 amount。
 * 编写一个函数来计算可以凑成总金额所需的最少的硬币个数。
 * 如果没有任何一种硬币组合能组成总金额，返回 -1。
 *
 * @author mascot
 * @date 2019/8/4 18:10
 */
public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        if (coins == null || coins.length == 0 || amount == 0) {
            return 0;
        }

        int[] count = new int[amount + 1];
        Arrays.fill(count, amount + 1);
        count[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (coin <= i) {
                    count[i] = Math.min(count[i], count[i - coin] + 1);
                }
            }
        }

        return count[amount] > amount ? -1 : count[amount];
    }
}
