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

        int[] paths = new int[n];
        paths[0] = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 1; j < n; j++) {
                paths[j] += paths[j - 1];
            }
        }

        return paths[n - 1];
    }
}
