package medium;

/**
 * 给定一个包含非负整数的 m x n 网格，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
 * @author mascot
 * @date 2019/4/13 22:15
 */
public class MinPathSum {
    public int minPathSum(int[][] grid) {

        for (int i = 1; i < grid.length; i++) {
            grid[i][0] += grid[i - 1][0];
        }

        for (int i = 1; i < grid[0].length; i++) {
            grid[0][i] += grid[0][i - 1];
        }

        for (int i = 1; i < grid.length; i++) {
            for (int j = 1; j < grid[0].length; j++) {
                grid[i][j] += Math.min(grid[i - 1][j], grid[i][j - 1]);
            }
        }
        return grid[grid.length - 1][grid[0].length - 1];
    }
}
