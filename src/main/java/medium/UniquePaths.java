package medium;

/**
 * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。
 *
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。
 *
 * 问总共有多少条不同的路径？
 *
 * @author mascot
 * @date 2019/4/21 11:10
 */
public class UniquePaths {

    public int uniquePaths(int m, int n) {

        int totalStep = m + n - 2;
        int step = m < n ? m - 1 : n - 1;
        long result = 1;
        for (int i = 1; i <= step; i++) {
            result = result * (totalStep - i + 1) / i;
        }

        return (int) result;
    }
}
