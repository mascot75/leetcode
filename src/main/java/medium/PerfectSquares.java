package medium;

/**
 * 279. 完全平方数
 * <p>
 * 给定正整数 n，找到若干个完全平方数（比如 1, 4, 9, 16, ...）使得它们的和等于 n。
 * 你需要让组成和的完全平方数的个数最少。
 *
 * @author mascot
 * @date 2019/8/2 18:31
 */
public class PerfectSquares {
    public int numSquares2(int n) {
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            dp[i] = i;
            for (int j = 1; j * j <= i; j++) {
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }
        }
        return dp[n];
    }

    public int numSquares(int n) {
        //   Lagrange's Four Square theorem：每个正整数均可表示为4个整数（包括0）的平方和，
        //   所以只有四种可能结果，即[1,2,3,4]
        //   Legendre's three-square theorem：非4^a(8b+7)型的正整数都可以用三个整数的平方和表示，
        //   所以对于可以写成4^a(8b+7）类型的n，其结果只能为4

        //先根据上面提到的公式来缩小n
        while (n % 4 == 0) {
            n /= 4;
        }
        //如果满足公式 则返回4
        if (n % 8 == 7) {
            return 4;
        }
        //在判断缩小后的数是否可以由一个数的平方或者两个数平方的和组成

        for (int i = 0; (i * i) <= n; i++) {
            int j = (int) Math.sqrt((n - i * i));
            if (i * i + j * j == n) {
                //如果可以 在这里返回
                if (i != 0 && j != 0) {
                    return 2;
                } else {
                    return 1;
                }
            }
        }
        //如果不行 返回3
        return 3;

    }
}
