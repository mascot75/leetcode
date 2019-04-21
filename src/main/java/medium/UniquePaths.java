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

        if (n <= 0 || m <= 0) {
            return 0;
        }

        if (n == 1 || m == 1) {
            return 1;
        }

        int[][] paths = new int[m][n];
        for (int i = 0; i < m; i++) {
            paths[i][0] = 1;
        }

        for (int i = 0; i < n; i++) {
            paths[0][i] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                paths[i][j] = paths[i - 1][j] + paths[i][j - 1];
            }
        }

        return paths[m - 1][n - 1];
    }
}
